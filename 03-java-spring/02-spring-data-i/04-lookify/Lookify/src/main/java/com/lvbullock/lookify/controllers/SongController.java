package com.lvbullock.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lvbullock.lookify.models.Song;
import com.lvbullock.lookify.services.SongService;

@Controller
public class SongController {
	@Autowired
	private SongService songService;
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	//Get All songs
	@GetMapping("/dashboard") //localhost:8080
	public String dashboard(@ModelAttribute("Song") Song song, Model viewModel) {
		List<Song> allSongs = songService.getAllSongs();
		viewModel.addAttribute("allSongs", allSongs);
		return "dashboard.jsp";	
	}
	
	
	//Create A Song
	@GetMapping("/songs/new")  // can not have the same path for the GET POST PUT DELETE method)
	public String addSong(@ModelAttribute("Song") Song song, Model viewModel) {
		return "new.jsp";
	}
	
	@PostMapping("/songs/new")
	//@Valid annotation checks to see if the submitted object passes validation
	public String addL(@Valid @ModelAttribute("Song") Song song, BindingResult result) {

		if(result.hasErrors()) {
			return "new.jsp";  //going to WEB-INF file
		}
		
		else {
			this.songService.createSong(song);
			System.out.println(song.getTitle() + " successfully added!");

		}

		return "redirect:/dashboard";
	}
	
	//Get One Song (Read)
	@GetMapping("/songs/{id}")
	public String findById(@ModelAttribute("Song") Song song, Model viewModel, @PathVariable("id") Long id) {
		viewModel.addAttribute("song", songService.getSingleSong(id));
		return "details.jsp";
	}
	
	//Update A Song
	@GetMapping("/songs/edit/{id}")
	public String updateSong(@PathVariable("id") Long id, Model viewModel, @ModelAttribute("Song") Song song) {
		viewModel.addAttribute("song", songService.getSingleSong(id));
		return "edit.jsp";
	}
	@PostMapping("songs/edit/{id}")
	public String editSong(@Valid @ModelAttribute("Song") Song song, BindingResult result, @PathVariable("id") Long id, Model viewModel) {
		Long songId = song.getId();
		if(result.hasErrors()) {			
			return "edit.jsp";
		}
		
		else {
			this.songService.updateSong(song);
			System.out.println(song.getTitle() + " successfully updated!");
		}
		return "redirect:/songs/" + songId;
//		return "redirect:/songs/";
	}

	//Delete A Song
	@GetMapping("/songs/delete/{id}")
	public String deleteSong(@PathVariable("id") Long id) {
		this.songService.deleteSong(id);
		System.out.println("Song " + id + " was deleted!");

		return "redirect:/dashboard";
	}
	
	//Allows search for top 10 songs in database
	@GetMapping("/songs/topTen")
	public String topTen(Model viewModel) {
		List<Song> topTenSongs = songService.findTopTen();
		viewModel.addAttribute("topTenSongs", topTenSongs);
		return "topTen.jsp";
	}

	//Allows search for songs by Artist name
	@PostMapping("/search")
	public String searchByArtist(@RequestParam("artist") String artist, Model viewModel) {
		List<Song> artistSongs = songService.findByArtist(artist);
		viewModel.addAttribute("artistSongs", artistSongs);
		viewModel.addAttribute("artist", artist);
		return "artistSongs.jsp";
	}
}
