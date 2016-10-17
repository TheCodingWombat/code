
public class JavaTutorial5 {

    public static void main(String[] args) {

        int i = 0; //Declaration and initialization of an int variable

        //A while loop will execute the code in its body (the code in between the curly brackets) as long as the code between the parentheses right after the "while" keyword is true.
        while (true) { //When putting the boolean value "true" in the while loop, the loop will run forever until its stopped by something
            i++; //Every loop, i gets incremented by 1

            if (i == 5) {
                //If i equals 5, skip all code under this line that's in the body of this while loop
                //It will start at the top of this while loop again
                //The condition will be checked again (in this case it's still true, so the loop won't be over yet)
                //Than the code in the body will be executed again, but "i++" is right above this if statement, which means i won't be 5 anymore, and this continue keyword will be skipped
                continue;
            }

            System.out.println(i); //This won't print when i equals 5 because the continue keyword made the loop skip over this part and start the next iteration

            if (i == 20) {
                //If i equals 20, break the loop altogether, and continue executing the code right after the end of this while loop
                break;
            }
        } //end of while loop

        int j = 0;

        while (j < 10) { //As long as j is less than 10, this while loop will keep on iterating
            System.out.println(j);
            j++; //Because j is incremented every iteration, j will eventually be greater than 10, and this while loop will stop
        }

        int k = 10;

        //A do while loop is the same as a while loop, except for it guaranteeing that the code in the body is executed at least once.
        //In a do while loop, you first get the body, and then the condition
        //In this case the condition is false, because k equals 10, which is not less than 5
        //But because it is a do while loop, the code in the body will still be executed once.
        do {
            //body
            k++;
            System.out.println(k);
        } while (k < 5); //condition

        int l = 3;
        
        //If the condition is true at the first iteration, the do while loop functions the same as the normal while loop
        //This means that the do while loop does not add an iteration every time, but only when there would be no iterations.

        do {
            //The code in this body will be executed twice, once when l in this position is 3, and once when l is 4
            l++;
            System.out.println(l);
        } while (l < 5);

    } //End of main method

} //End of class
