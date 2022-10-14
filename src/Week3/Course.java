package Week3;

public class Course {
    private String title;
    private String code;

    public Course(String code, String title)
    {
        this.code = code;
        this.title = title;    
    }

    public String getTitle()
    {
        return title;
    }

    
    public String getCode()
    {
        return code;
    }
}
