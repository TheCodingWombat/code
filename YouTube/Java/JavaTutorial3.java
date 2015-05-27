// All Java code must be inside a class
// Classes can contain methods and variables, and can often be a template for objects
public class JavaTutorial3 {

    // When your program is started the main method is executed first
    public static void main(String[] args) {

        // Declaration and initiation of an int variable.
        int dayOfTheWeek = 1;

        // A switch statement compares the value of the variable between the parentheses with the values after the case keywords
        // If the value of the variable is equal to the value after a case keyword, the code after the ":" is executed
        // Write multiple cases after each other to make them all use the same code block
        // Use the break keyword so the program doesn't execute other code in cases below this case
        // You can't check for a double or float, but you can check for a byte, short, int, long, boolean, char and Strings
        // The code after the default keyword is executed if the variable that's being checked does not equal any of the cases

        switch (dayOfTheWeek) { // dayOfTheWeek is being checked
            case 1:case 8: // If dayOfTheWeek is 1 or 8 it will execute this code block, as well as the code block below
                System.out.print("Monday"); // Prints a String, Monday
                // Because there's no break keyword, the code in the code block below is also executed
            case 2: // If dayOfTheWeek is 2 it will execute this code block
                System.out.print("Tuesday");
                break; // The next code block won't be executed because of the present break keyword
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default: // If none of the cases matched the variable being checked, this code block will run
                System.out.print("Invalid number");
                break; // It is common practise to even add a break statement to the last, i.e. the default, case
        } // End of switch statement

        //Declaration and initiation of a String variable; a bunch of characters next to each other
        String message = "Hello";

        // A switch statement that compares the value of the variable message with the different cases
        // To be able to run this switch statement you have to use JDK 7 or greater
        
        switch (message) {
            case "Hello": // The values after case are Strings themselves here, and have to be surrounded with quotation marks
                System.out.println("Hello there");
                System.out.println("How are you?");
                break;
            case "Bye":
                System.out.println("It was nice meeting you");
                System.out.println("Have a nice day");
                break;
            default:
                System.out.println("I don't understand you");
                break;
        } // End of switch statement

    } // End of main method

} // End of JavaTutorial3 class
