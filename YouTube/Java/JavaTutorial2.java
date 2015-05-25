// All Java code must be inside a class
// public means that this class can be accessed by every other class
// classes can contain methods and variables, and can often be a template for objects
// The name after class must be the same as the name of the document
// Everything between the curly brackets ("{" and "}") is part of this class
public class JavaTutorial2 {

    // When your program is started the main method is executed first
    // public means all other classes and methods can use this method
    // static means this method is part of the class itself and not of an individual object
    // void means this method doesn't return any information after execution
    // main is the name of the method and must have a String array (String[]) with name args as a parameter.
    // Everything between the curly brackets is part of the main method
    public static void main(String[] args) {

        // Declaration and initiation of two int variables. An int is just a whole number
        int intOne = 5;
        int intTwo = 8;

        /*
         * Java's Relational operators
         * == is equal to
         * != is not equal to
         * >  is greater than
         * >= is greater than or equal to
         * <  is less than
         * <= is less than or equal to
         */

        // Two equals signs means: Compare what's on the right to the left
        // One equal sign means: Assign what's on the right to the variable on the left

        // An if statement checks if what's between the parentheses is true
        // If it is true, it will execute the code inside the body of the if statement
        // To compare two variables or a variable and a normal value we have to use relational operators
        // To make additional checks we use else if, and in between the parentheses we perform another check
        // Once a check evaluated to true, all following checks will be skipped
        // If none of the checks evaluated true, and there is an else block, the code inside of that will execute

        if (intTwo == 5) { // This executes if the value of intTwo is equal to 5
            System.out.println("intTwo is equal to 5"); // A print statement that will display text to the user
        } else if (intTwo >= 10) { // This executes if intTwo is greater than or equal to 10 and the statement above failed
            System.out.println("IntTwo is greater than or equal to 10");
        } else if (intTwo != 8) { // This executes if the value of intTwo is not equal to 8 and all statements above failed
            System.out.println("intTwo is not 8");
        } else { // The else block executes when none of the above were true
            System.out.println("Nothing was true");
        }

        /*
         * Java's Conditional operators
         * !  Converts the boolean value from true to false
         * && Returns true if both values are true
         * &  Returns true if both values are true, if first statement is false, stop checking
         * || Returns true if one or both values are true
         * |  Returns true if one both values are true, if first statement is true, stop checking
         * ^  Returns true if only one of both values is true
         */

        // To check multiple statements at once we use conditional operators

        // Declaration and initiation of a boolean variable
        boolean myBoolean = false;

        if (!(intOne < 2)) { // Reverts the outcome of intOne < 2. If it was true it becomes false, and vice versa
            System.out.println("intOne is not smaller than 2");
        }

        if (intOne < 2 || intOne > 0) { // Evaluates true if the left or the right or both statements are true
            System.out.println("intOne is smaller than 2 AND/OR intOne is greater than 0");
        }

        if (intOne < 2 ^ intOne > 0) { //Evaluates true if the left or the right but NOT both statements are true
            System.out.println("intOne is smaller than 2 OR intOne is greater than 0");
        }

        // If you only use the name of a boolean inside of the parentheses of an if statement it check if its value is true
        // If you precede the name of a boolean with a !, it checks if its value is false
        if (intOne > 2 && intTwo == 8 && !myBoolean) { //You can perform more than 2 checks
            System.out.println("All three statements evaluated true");
        }

        // The & operator doesn't check the second statement if the first statement is false, && does check the second statement
        // The | operator doesn't check the second statement if the first statement is true, || does check the second statement

    } //End of main method

} //End of JavaTutorial2 class
