package CW1;

public class Song {
    
    private int id;
    private String artist;
    private String title;
    private String streams;

    public Song(int id, String artist, String title, String streams)
    {
        this.id = id;
        this.artist = artist;
        this.title = title;
        this.streams = streams;
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

    public String getStreams()
    {
        return streams;
    }

    public void print()
    {
        System.out.println("" + id + " " + artist + " " + title + " " + streams);
    }
}