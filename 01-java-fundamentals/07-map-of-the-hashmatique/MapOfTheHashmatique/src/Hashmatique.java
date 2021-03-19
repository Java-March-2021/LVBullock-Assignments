import java.util.HashMap;

public class Hashmatique{

    public static final String RESET = "\033[0m";  // Text Reset
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW


    public static void main(String[] args){
    	
        System.out.println("\nLaura Bullock - March 2021 Java Cohort - Map of the Hashmatique Assignment - March 12, 2021 \n");

        //TASK 1:  Create a trackList of type HashMap
        HashMap<String, String> trackList = new HashMap<String, String>();
        //TASK 2:  Add in at least 4 songs that are stored by title
        trackList.put("Way Maker", "\nYou are here, moving in our midst, \nI worship you, I worship you, \nYou are here, working in this place... \nhttp://www.songlyrics.com/sinach/waymaker-lyrics/");
        trackList.put("There's an Overflow", "\nThere is an outpouring of abundance.  \nNew doors have been opened.  \nThe land, it is green.  \nA new grace has been released... \nhttps://www.azlyrics.com/lyrics/sinach/theresanoverflow.html");
        trackList.put("The Name of Jesus", "\nThe Name of Jesus, Oh Lord.  \nIn all the earth, your name is strong and mighty.  \nYour name is glorious and great.  \nIn Him we are saved... \nhttp://www.songlyrics.com/sinach/the-name-of-jesus-lyrics/");
        trackList.put("Great Are You Lord", "\nHoly Holy, God Almighty.  \nIt's a privilege to worship You.  \nMaker of all universe, it's an honour just to stand before You... \nhttp://www.songlyrics.com/sinach/great-are-you-lord-lyrics/");

        //TASK 3:  Pull out one of the songs by its track title
        System.out.println(CYAN_BOLD_BRIGHT + "TASK 3 --> Pull out one of the songs by its track title --> Lyrics for Sinach's 'There's an Overflow': " + RESET);
        System.out.println(trackList.get("There's an Overflow"));

        System.out.println(YELLOW_BOLD_BRIGHT + "\n\n********************************************************************************************\n" + RESET);

        //TASK 4:  Print out all the track names and lyrics in the format Track: Lyrics
        System.out.println(CYAN_BOLD_BRIGHT + "\nTASK 4 --> Print out all the Sinach track names and lyrics in the format --> Track: Lyrics: \n" + RESET);
        for(HashMap.Entry<String, String> song : trackList.entrySet()){  //iterating through the HashMap using set
            // System.out.println("Track: " + song.getKey());
            // System.out.println("Lyrics: " + song.getValue() + "\n");
            System.out.println(CYAN_BOLD_BRIGHT + song.getKey() + RESET + ": " + song.getValue() + "\n");
        }
    }      
}