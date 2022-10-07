package Week1;

import helpers.InputReader;
public class Week1 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 1 Java Basic Input/Output ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        enterName();
        areaOfRectangle();
        averageAndReverse();
        birthYearFromAge();
        milesFromFeet();
        interestOnDeposit();

    }

    private static void milesFromFeet()
    {
        float feet = InputReader.getInt("How many feet? ");
        float miles = feet / 5280;
        System.out.println(feet + " feet is " + miles + " miles");
        System.out.println("");
    }

    private static void birthYearFromAge()
    {
        int age = InputReader.getInt("Enter your age: ");
        System.out.println("Were you born in " + (2022 - age) + "?");
        System.out.println("");
    }

    private static void averageAndReverse() 
    {
        int first = InputReader.getInt("Enter the first number > ");
        int second = InputReader.getInt("Enter the second number > ");
        float avg = (first + second);
        avg /= 2; 
        System.out.println(avg);

        System.out.println("Normal order: " + first + " " + second);
        System.out.println("Reverse order: " + second + " " + first);
        System.out.println("");
    }

    private static void areaOfRectangle()
    {
        int width = InputReader.getInt("Enter the width > ");
        int height = InputReader.getInt("Enter the height > ");
        System.out.println(width * height);
        System.out.println("");
    }

    private static void enterName()
    {
        String name = InputReader.getString("Enter your name > ");
        System.out.println("Hello " + name);
        System.out.println("");
    }

    private static void interestOnDeposit()
    {
        float deposit = InputReader.getInt("Enter your deposit: ");
        deposit *= 1.01;
        System.out.println("You will have " + deposit + " pounds at the end of the year");
        System.out.println("");
    }
}
