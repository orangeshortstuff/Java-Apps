package Week2;

import helpers.InputReader;

public class Week02 
{
    public static final int FIRST_MARK = 70;
    public static final int UPPER_SECOND_MARK = 60;
    public static final int LOWER_SECOND_MARK = 50;
    public static final int THIRD_MARK = 40;
    public static final int FAIL_MARK = 1;
    public static final int LOWER_BOUND = 0;
    public static final int UPPER_BOUND = 100;

    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 2 Java Selection & Iteration ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        doConvertGrade();
        doGetMark();
        doTimesTables();
        
    }

    private static void doGetMark()
    {
        int mark;
        do
        {
            mark = InputReader.getInt("What mark did you get? > ");
        }
        while(mark > UPPER_BOUND || mark < LOWER_BOUND);

        if(mark >= FIRST_MARK) {
            System.out.println("Your grade is First Class!");
        }

        else if(mark >= UPPER_SECOND_MARK) {
            System.out.println("Your grade is Upper Second Class");
        }

        else if(mark >= LOWER_SECOND_MARK) {
            System.out.println("Your grade is Lower Second Class");
        }
        
        else if(mark >= THIRD_MARK) {
            System.out.println("Your grade is Third Class");
        }

        else if(mark >= FAIL_MARK) {
            System.out.println("You Failed");
        }

        else {
            System.out.println("You didn't submit any work");
        }
    }

    private static void doConvertGrade()
    {
        String grade = InputReader.getString("Please enter your grade > ");
        char letter = grade.charAt(0);

        if(letter == 'A')
        {
            System.out.println("Your grade is First Class!");
        }

        else if(letter == 'B')
        {
            System.out.println("Your grade is Upper Second Class");
        }

        else if(letter == 'C')
        {
            System.out.println("Your grade is Lower Second Class");
        }

        else if(letter == 'D')
        {
            System.out.println("Your grade is Third Class");
        }

        else if(letter == 'E')
        {
            System.out.println("Your grade is Ordinary Class");
        }

        else if(letter == 'F')
        {
            System.out.println("You Failed");
        }
        else {
            System.out.println("Invalid Grade");
            doConvertGrade();
        }

    }

    private static void doTimesTables()
    {
        int multiple; int product; int value; String repeat;
        do {
        multiple = InputReader.getInt("What number do you want to multiply? > ");
        for (value = 1; value <= 12; value++)
            {
            product = value * multiple;
            System.out.println(value + " x " + multiple + " = " + product);
            }
        repeat = InputReader.getString("Do you want to multiply another number? > ");
        }
        while(repeat.equals("Yes"));
        System.out.println("See you next time!");
    }
}
