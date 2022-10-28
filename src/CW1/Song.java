package CW1;

/* This class allows information about a song to be stored, this being:
 * 1. The title of the song
 * 2. The artist that made the song
 * 3. The amount of plays the song has
 * 4. An internal ID for easy retrieval of the first three
*/
public class Song {
    
    private int id;
    private String artist;
    private String title;
    private int playCount;

    public Song(String title, String artist, int playCount, int id)
    {
        this.id = id;
        this.artist = artist;
        this.title = title;
        this.playCount = playCount;
    }

    // get the ID of the song
    public int getID()
    {
        return id;
    }

    // get the number of plays for the song
    public int getPlayCount()
    {
        return playCount;
    }

    // get the name of the artist who made the song - currently unused
    public String getArtist()
    {
        return artist;
    }

    // get the title of the song - currently unused
    public String getTitle()
    {
        return title;
    }

    // print the information of a song
    public void print()
    {
        System.out.println("Title: " + title + " Artist: " + artist + " Plays: " + playCount + " ID: " + id);
    }
}