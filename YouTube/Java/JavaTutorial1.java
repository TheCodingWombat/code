// This is a comment, everything after ("//") on this line will be ignored by Java
/*
    This is a multi line comment
    To create it, start the comment with a forward slash ("/") and an astrix ("*")
     and end it with an astrix and a forward slash
 */

// All Java code must be inside a class
// Besides the class we make here, there are thousands of classes already inside of Java that you can use
// public means that this class can be accessed by every other class
// classes can contain methods and variables, and can often be a template for objects
// The name after class must be the same as the name of the document
// Everything between the curly brackets ("{" and "}") is part of this class
public class JavaTutorial1 {

    // When your program is started the main method is executed first
    // public means all other classes and methods can use this method
    // static means this method is part of the class itself and not of an individual object
    // void means this method doesn't return any information after execution
    // main is the name of the method
    // Everything between the parentheses are the parameters of the method.
    // main must have a String array (String[]) as a parameter. We call that String array args
    // Everything between the curly brackets is part of the main method
    public static void main(String[] args) {

        // System.out.println() is a method that prints information to the screen
        // out is an object of type PrintStream that is a static member of class System
        // println is a method of the out object, it prints information and adds a line break after it
        // To print something you have to put it in between the parentheses of the println() method call.
        // Calling a method is simply asking it to execute its code
        // If you want to print normal text, you have to surround it with quotation marks.
        // Normal text is called a String: a bunch of characters next to each other
        // Every statement (a method call is a statement) has to be followed by a semicolon (";")
        System.out.println("Hello World");

        // Variables that are created inside a method are local variables.
        // Local variables can only be used inside that method
        // All variables need a type and a name
        // String is the type; byeMessage is the name
        // Variable, class and method names are case sensitive,
        //  and can contain letters, numbers, ("_") and ("$"), but can't start with a number
        // You assign a value to a variable by using the = sign.
        String byeMessage = "Bye Worlds";

        // print() does the same as println() but without an extra line break
        System.out.print(byeMessage);
        System.out.println(byeMessage);
        System.out.println(byeMessage);
        System.out.println(byeMessage);

        /*
         * You can add characters to a String that would otherwise interfere with your code
         * First type a backslash ("\") followed by what you want to be escaped
         * \b - Backspace
         * \f - Formfeed
         * \n - Newline
         * \r - Carriage return
         * \t - Tab
         * \" - Quotation marks
         * \' - Apostrophes
         * \\ - Backslash
         */

        // This String will print its escaped quotes as well as a line break
        String quotedString = "\"This will print \nthe quotation marks as well\"";

        /*
         * Java's 8 primitive data types
         * byte    - A number between -128 and 127
         * short   - A number between -32768 and 32767
         * int     - A number between -2^31 and 2^31-1   (up to a few billion, a 1 with 9 zeroes)
         * long    - A number between -2^63 and 2^63-1   (up to a few quintillion, a 1 with 18 zeroes)
         * float   - A number with a floating point                (precise to roughly 6 decimal places)
         * double  - A more precise number with a floating point   (precise to roughly 15 decimal places)
         * boolean - Either true or false
         * char    - A character like 'a' or '@' represented as a number
         */

        byte myByte = 120;
        short myShort = 16000;
        int myInt = 200000000;
        long myLong = 123981029389123823L; // A long needs an "L" or "l" to tell Java it is not an int
        float myFloat = 2.5F; // A float needs an "F" or "f" to tell Java it is not a double
        double myDouble = 3.1415;
        boolean myBoolean = true;
        char myChar = 66;   // chars can be created with a number; 66 represents an uppercase "B".
        char myChar2 = 'B'; // When you don't use a number, but the character itself, surround it with apostrophes.
                            // char a = 6 and char b = '6' do not represent the same character
                            // Check Check http://asciitable.com/ for a list of characters

        String name = "Richard";
        byte age = 30;

        // You can combine Strings and variables using the + sign.
        // White space in between variables, Strings and the plus sign is ignored
        System.out.println(name + " is " + age +
                " years old.");

        // age = age + 1; will throw an error, because 1 is an int and age is a byte
        // you can't add an int to a byte and save the result to a byte because a byte
        //  has a smaller range than an int
        // To do this properly you have to cast (temporarily convert) the sum by
        //  preceding it with the type you want to cast to, surrounded with parentheses
        age = (byte) (age + 1); // adds 1 to the current value of a, and saves the new value to a
        // You also have (short), (int), (long), (float) and (double). You can't cast booleans and chars

        System.out.println(name + " is almost " + age + " years old.");

        // The modulus operator ("%") gives you the remainder of the division
        System.out.println(9 % 4); // Prints 1 because 4 fits 2 times in 9 and then there is 1 left

        double myPi = 3.1415;
        boolean trueOrFalse = false;
        String favoriteNumber = "17";

        // To convert from primitive data type to String by using one of the toString() methods
        // We assign String b to the converted double
        String c = Double.toString(myPi); //We use Double the variable myPi is a double
        String b = Boolean.toString(trueOrFalse); // Converts trueOrFalse to a String and assigns the value to b
        // You also have Byte.toString(), Short.toString(), Integer.toString(),
        // Long.toString(), Float.toString() and Character.toString()
        // Note that Integer and Character are not abbreviated to Int and Char or int and char

        // To convert from String to primitive data type you have to parse a String.

        // This converts favoriteNumber to an int and assigns it to variable a so we can do calculations with it
        int a = Integer.parseInt(favoriteNumber);
        // You also have Byte.parseByte(), Short.parseShort(), Long.parseLong(),
        // Float.parseFloat(), Double.parseDouble() and Boolean.parseBoolean()

        // The old variables myPi, trueOrFalse and favoriteNumber were only temporarily converted
        //  and that's why you had to save them in new variables c, b and a respectively
        // Here they are still a double, boolean and String respectively

        a = a * 2; // Multiplies a by 2 and assigns the value back to a
        a *= 2; // Shorthand notation for multiplying by a number and assigning the result back to the variable
        // Shorthand notation for subtracting one from a variable 
        // and assigning that new value back to the variable. You also have a++;
        a--;
        a++;

        System.out.println(a);

    } // End of main method

} // End of JavaTutorial1 class
