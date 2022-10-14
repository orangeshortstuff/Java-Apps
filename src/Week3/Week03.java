package Week3;

import helpers.InputReader;

public class Week03 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    private static Course myCourse;
    private static Student enrollee;
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" Week 3 Classes, Objects, Constructors ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        createStudent();
        createCourse();
        enrolStudent();
    }

    public static void enrolStudent()
    {
        enrollee.enrol(myCourse);
        System.out.println(enrollee.getCourse());
    }

    public static void createCourse()
    {
        String code = InputReader.getString("Enter your course code > ");
        String title = InputReader.getString("Enter your course title > ");

        Course myCourse = new Course(code,title);
        System.out.println(myCourse.getTitle() + " (" + myCourse.getCode() + ")");
    }

    public static void createStudent() {
        String id = InputReader.getString("Enter your ID > ");
        boolean isValid = false;
        String name = "anon";
        while (!isValid)
        {
            name = InputReader.getString("Enter your name > ");
            String answer = InputReader.getString(name + " Is this name correct? > ");

            if(answer.contains("yes"))
            {
                isValid = true;
            }
        }
        enrollee = new Student(id,name);
        System.out.println(enrollee.getName() + " " + enrollee.getID());
    }
}
