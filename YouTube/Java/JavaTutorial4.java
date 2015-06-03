// To use methods in external classes, you have to import them
// Importing a class means allowing you to use the methods inside of that class
// To import, type the keyword import followed by the pathname to the class, above the class body
// Scanner is the class; it is inside the folder util, which is inside the folder java
import java.util.Scanner;

// By importing a folder pathname followed by an astrix you import all the classes in that folder
// This line of code will import all the class in the folder util, including the Scanner class
import java.util.*;

// Creation of the class
public class JavaTutorial4 {

    // Creation of the main method; the method that executes first when the program starts
    public static void main(String[] args) {

        // Declaration of a String variable
        String startMessage;
        // Initialization of that same String variable
        startMessage = "Welcome!";
        // Prints the value of startMessage
        System.out.println(startMessage);

        // Creates an Object called userInput of type Scanner which scans System.in, i.e. the keyboard
        // An object is basically a copy of a class
        // All Objects created from the same class, Scanner, can use all methods inside of that class
        // They can however call the methods at different times and different orders, and use different variables
        // Objects are built using the same instructions, but are individual entities
        // They don't all do the same thing a the same time
        // We have to create an object because you might want to make multiple Scanners that scan different input devices
        Scanner userInput = new Scanner(System.in);

        // Declaration and initialization of an empty String variable and an int variable with value 0
        String name = "";
        int age = 0;

        // Prints "Enter age: "
        System.out.print("Enter age: ");

        // hasNextInt() is a method inside of the Scanner class. We call it on userInput (the Scanner object) using a "."
        // It checks if the next thing, entered after "Enter age: " was printed, is an int, if so, it evaluates true
        if (userInput.hasNextInt()) {
            // nextInt() retrieves the next int that was entered in the console; here it assigns it to age
            // If the next thing entered wasn't an int, this would give an InputMismatchException, i.e. an error
            // But because we used hasNextInt() above, this code won't be run if it isn't an int, and can't give an error
            age = userInput.nextInt();
        } else {
            // If the next thing entered in the console isn't an int, this will print "Enter int next time"
            System.out.println("Enter int next time");
        }

        /* Besides hasNextInt() and nextInt(), you can also use
         * hasNextByte()    and nextByte()
         * hasNextShort()   and nextShort()
         * hasNextLong()    and nextLong()
         * hasNextDouble()  and nextDouble()
         * hasNextFloat()   and nextFloat()
         * hasNextBoolean() and nextBoolean()
         */


        // Prints "Enter name: "
        System.out.print("ENter name: ");

        // Here nextLine() will retrieve the invisible character that was left on the previous line
        // After we entered an int above, we pressed enter. That enter key is an invisible character, and it's still on the last line
        // To get rid of this invisible character so we can scan more things after it, we have to scan the entire line using nextLine()
        // We are not assigning it to any variable so the data will just be lost; we do this because we don't need it afterwards
        userInput.nextLine();

        // hasNextLine() checks if there are characters on the nextLine that's checked in the console, if so, it evaluates true
        if (userInput.hasNextLine()) {
            // nextLine() retrieves all entered characters on the nextLine; here it assigns it to name
            name = userInput.nextLine();
        }

        // Prints the values of name and age with a space in between the two
        System.out.println(name + " " + age);

        // Prints "Enter name again: "
        System.out.print("ENter name again: ");

        // hasNext() does the same thing as hasNextLine()
        if (userInput.hasNext()) {
            // next() retrieves all characters up to the first space character that were entered; here it assings it to name
            // If I were to enter "Richard Koetschruyter", only "Richard" would be assigned to name
            name = userInput.next();
        }

    }

}
