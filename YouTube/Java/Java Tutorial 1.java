/**
 * Created by The Coding Wombat on 22-5-2015 at 20:05 at 20:08.
 */

public class JavaTutorial1 {

    public static void main(String[] args) {

        // Escaping characters

        /*
        \b - Backspace
        \f - Formfeed
        \n - Newline
        \r - Carriage return
        \t - Tab
        \" - Quotation marks
        \' - Apostrophes
        \\ - Backslash
        */

        String byeMessage = "\"Bye \nWorlds\"";

        /*
        System.out.println(byeMessage);
        System.out.println(byeMessage);
        System.out.println(byeMessage);
        System.out.println(byeMessage);
        */

        /*
        byte    - A number between -128 and 127
        short   - A number between -32768 and 32767
        int     - A number between -2^31 and 2^31-1   (up to a few billion, a 1 with 9 zeroes)
        long    - A number between -2^63 and 2^63-1   (up to a few quintillion, a 1 with 18 zeroes)
        float   - A number with a floating point                (precise to roughly 6 decimal places)
        double  - A more precise number with a floating point   (precise to roughly 15 decimal places)
        boolean - Either true or false
        char    - A character like 'a' or '@' represented as a number
        */

        byte myByte = 120;
        short myShort = 16000;
        int myInt = 200000000;
        long myLong = 123981029389123823L;
        float myFloat = 2.5F;
        double myDouble = 3.1415;
        boolean myBoolean = true;
        char myChar = 66;
        char myChar2 = 'B';

        String name = "Richard";
        byte age = 30;

        System.out.println(name + " is " + age + " years old.");

        age = (byte) (age + 1);

        System.out.println(name + " is almost " + age + " years old.");

        System.out.println(9 % 4);

        double myPi = 3.1415;
        String favoriteNumber = "17";
        boolean trueOrFalse = false;

        Double.toString(myPi);
        int a = Integer.parseInt(favoriteNumber);
        Boolean.toString(trueOrFalse);

        a = a * 2;
        a *= 2;
        a--;

        System.out.println(a);

    }
}
