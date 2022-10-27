package CW1;
import helpers.InputReader;

import java.util.ArrayList;  /* any language that doesn't give you lists by default is a meme, by definition/
/**
 * This class will allow the user to 
 * 1. add a new song 
 * 2. to delete an old song
 * 3. print all the songs
 * 4. or print the top songs
 * @author: Alexander Walker
*/
public class SongList
{
    private ArrayList<Song> songs;

    public SongList()
    {
        songs = new ArrayList<Song>();
        openMainMenu();
    }

    /**
     * This method will ask the user for the song's
     * title, the artist, and how many times
     * it's been streamed
     */
    private void addSong() {
        System.out.println("Adding a song");
        String name = InputReader.getString("What is the name of the song? > ");
        String artist = InputReader.getString("Which artist / band made this song?");
        String streams = InputReader.getString("How many times has this song been streamed? > ");
        Song song = new Song(songs.size(), name, artist, streams);
        songs.add(song);
    }

    /**
     * This method will find a song object
     * given a valid ID
    */
    private Song findSong(int id)
    {
        for (Song song : songs)
        {
            if (song.getID() == id)
            {
                return song;
            }
        }
        return null;
    }

    /**
     * This method will delete a song
     * when given its ID
     */
    private void deleteSong() 
    {   
        int id = InputReader.getInt("Enter the ID of the song to be deleted > ");
        if (id != findSong(id).getID()) // find the song with the same id, and then retrieve it
        { 
            songs.remove(id);
        }
    }

    /*
     * This method prints every song object added to the array
    */
    private void printSongs()
    {
        System.out.println("\nPrinting songs\n");
        for (Song song : songs)
        {
            song.print();
        }
    }


    private void openMainMenu()
    {
        boolean quitting = false;
        while(!quitting)
        {
            System.out.println("1. Add a song \n2. Remove a song \n3. Print all songs \n4. Print all popular songs\n");

            int choice = InputReader.getInt("Please enter your choice (1-5, numbers only) > ");

            switch(choice)
            {
                case 1: addSong(); break;
                case 2: deleteSong(); break;
                case 3: printSongs(); break;
                case 4: quitting = true; break;
            }
        }
    }
}
