package CW1;

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

    public int getID()
    {
        return id;
    }

    public String getArtist()
    {
        return artist;
    }

    public String getTitle()
    {
        return title;
    }

    public int getplayCount()
    {
        return playCount;
    }

    public void print()
    {
        System.out.println("Title: " + title + " Artist: " + artist + " Plays: " + playCount + " ID: " + id);
    }
}