package CW1;
import helpers.InputReader;

import java.util.ArrayList;

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
        addDefaultSongs();
        openMainMenu();
    }

    /**
     * This method will ask the user for the song's
     * title, the artist, and how many times
     * it's been played
     */
    private void addSong()
    {
        System.out.println("Adding a song");
        String title = InputReader.getString("What is the title of the song? > ");
        String artist = InputReader.getString("Which artist / band made this song? > ");
        int playCount = InputReader.getInt("How many times has this song been played? > ");

        int id = 0;
        boolean usedID = true;
        while (usedID) // start assuming the ID is used
        {
            if (findSongID(id) == -1) // if this ID is unused in the list, use it for this song
            {
                usedID = false;
            }
            else // else increment the ID, and repeat
            {
                id++;
            }
        }

        Song song = new Song(title, artist, playCount, id);
        songs.add(song);
        System.out.println(title + " by " + artist + " has been added with ID " + id);
    }

    /**
     * This method will check if the list
     * contains a song with the given ID
    */
    private int findSongID(int id)
    {
        for (Song song : songs)
        {
            if (song.getID() == id)
            {
                return id;
            }
        }
        return -1;
    }

    /**
     * This method will delete a song
     * when given its ID
     */
    private void deleteSong() 
    {   
        System.out.println("Removing a song");
        int id = InputReader.getInt("Enter the ID of the song to be deleted > ");
        if (id < 0) {
            System.out.println("ID cannot be negative");
            return;
        }
        if (id == findSongID(id)) // find if there is a song with the ID entered
        {   
            // to prevent a bug, look for the song with that ID, and remove that index
            int songIndex = 0;
            boolean found = false;
            Song deadSong = songs.get(songIndex);
            while (!found)
            {
                if (deadSong.getID() == id)
                {
                    System.out.println("Removed " + deadSong.getTitle() + " by " + deadSong.getArtist() + " from the list.");
                    songs.remove(songIndex);
                    found = true;
                }
                else
                {
                    songIndex++;
                    deadSong = songs.get(songIndex);
                }
            }
        }
        else {
            System.out.println("Song with ID " + id + " not found.");
        }
    }

    /*
     * This method prints every song object in the array
    */
    private void printSongs()
    {
        System.out.println("\nPrinting songs\n");

        for (Song song : songs)
        {
            song.print();
        }
    }

    /*
     * This method prints every song object in the array
     * with the same or more than a given amount of plays
    */
    private void printPopularSongs()
    {
        int lowestStreamCount = InputReader.getInt("What is the minimum amount of plays? > ");
        System.out.println("\nPrinting popular songs\n");
        for (Song song : songs)
        {
            if (song.getPlayCount() >= lowestStreamCount)
            {
                song.print();
            }
        }
    }

    /* This method adds songs before the main menu kicks in.
     * Used for testing the functions of the program
     * without having to add them in every time.
    */
    private void addDefaultSongs()
    {
        Song song = new Song("Pool", "Tricot", 2152394, 0);
        songs.add(song);

        song = new Song("Never Meant", "American Football", 5789672, 1);
        songs.add(song);
        
        song = new Song("Pork Ginger", "Tricot", 25463, 2);
        songs.add(song);

        song = new Song("Harder, Better, Faster, Stronger", "Daft Punk", 119979966, 3);
        songs.add(song);

        song = new Song("Yume Utsutsu", "Lamp", 6144363, 4);
        songs.add(song);

        song = new Song("Ares", "Covet", 57240, 5);
        songs.add(song);

        song = new Song("Swimming Pools (Drank)", "Kendrick Lamar", 146066924, 6);
        songs.add(song);

        song = new Song("Rapp Snitch Knishes", "MF DOOM", 13640175, 7);
        songs.add(song);

        song = new Song("HUMBLE.", "Kendrick Lamar", 880961855, 8);
        songs.add(song);

        song = new Song("Dirty Boy", "Cardiacs", 24784, 9);
        songs.add(song);
    }

    private void openMainMenu()
    {
        boolean quitting = false;
        while(!quitting)
        {
            System.out.println("\n === Main Menu ===\n");
            System.out.println("1. Add a song \n2. Remove a song \n3. Print all songs \n4. Print all popular songs \n5. Quit \n");

            int choice = InputReader.getInt("Please enter your choice (1-5, numbers only) > ");

            switch(choice)
            {
                case 1: addSong(); break;
                case 2: deleteSong(); break;
                case 3: printSongs(); break;
                case 4: printPopularSongs(); break;
                case 5: quitting = true; break;
            }
        }
    }
}
