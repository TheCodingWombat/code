public class AnotherClassOld2 {

    public static void main(String[] args) {

        /* Conditional operators
         * !  Converts the boolean value from true to false
         * && Returns true if both values are true
         * &  Returns true if both values are true, if first statement is false, stop checking
         * || Returns true if one or both values are true
         * |  Returns true if one both values are true, if first statement is true, stop checking
         * ^  Returns true if only one of both values is true
         */

        int intOne = 5;
        int intTwo = 8;
        boolean myBoolean = false;

        if (intOne > 2 && intTwo == 8 && !myBoolean) {
            System.out.println("This is true");
        }





        /* Relational operators
         * == is equal to
         * != is not equal to
         * >  is greater than
         * >= is greater than or equal to
         * <  is less than
         * <= is less than or equal to
         */

        if (intTwo == 5) {
            System.out.println("Only printed if true");
        } else if (intTwo >= 10) {
            System.out.println("Second if statement is true");
        } else if (intTwo != 8) {
            System.out.println("Third if statement is true");
        } else {
            System.out.println();
            //System.out.println("Nothing was true");
        }


    }

}
