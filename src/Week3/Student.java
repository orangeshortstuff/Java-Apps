package Week3;

public class Student {
    private String id;
    private String fullName;
    private Course course;

    public Student(String id, String fullName)
    {
        this.id = id;
        this.fullName = fullName;
    }

    public String getID()
    {
        return id;
    }

    
    public String getName()
    {
        return fullName;
    }

    public void enrol(Course course)
    {
     this.course = course;  
    }

    public Course getCourse()
    {
     return this.course;  
    }
}
