package Week2;

import helpers.InputReader;

public class Week02 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static final int SEVEN = 7;
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

        do7TimesTable();
        doConvertGrade();
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
            doConvertGrade();
        }

    }

    private static void do7TimesTable()
    {
        int product; int multiple;
        for (multiple = 1; multiple <= 12; multiple++)
        {
            product = multiple * SEVEN;
            System.out.println(multiple + " x " + SEVEN + " = " + product);
        }
    }     
}
