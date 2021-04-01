package com.lvbullock.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lvbullock.lookify.models.Song;
import com.lvbullock.lookify.repositories.SongRepository;

@Service
public class SongService {
	//Dependency Injection

	private SongRepository songRepo; //gives us access to the Repository
	
	public SongService(SongRepository repo) {
		this.songRepo = repo;
	}
	
	//MAKE CRUD METHODS  CRUD: C = Create  R = Read   U = Update   D = Delete
	
	//Get All Songs
	public List<Song> getAllSongs(){
		return this.songRepo.findAll();
	}
	
	//Create A Song
	public Song createSong(Song newSong) {
		return this.songRepo.save(newSong);
	}
	
	//Get One Song (Read)
	public Song getSingleSong(Long id) {
		return this.songRepo.findById(id).orElse(null); //id is an optional(a boolean) (return everything or nothing)
	}

	//Update A Song
	public Song updateSong(Song SongToUpdate) {
		return this.songRepo.save(SongToUpdate);
	}
	
	//Delete A Song
	public void deleteSong(Long id) {  //note:  not public Song here because we are returning a string confirmation
		this.songRepo.deleteById(id);
	}

	//Allows search for songs by Artist name
	public List<Song> findByArtist(String artist) {
		return this.songRepo.findByArtistContaining(artist);
	}
	
	//Allows search for top 10 songs in database
	public List<Song> findTopTen(){
		return this.songRepo.findTop10ByOrderByRatingDesc();
	}
}
