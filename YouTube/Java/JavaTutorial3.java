public class Lesson3 {

    public static void main(String[] args) {

        //int dayOfTheWeek = 4564211;

        String message = "Hello";

        switch (message) {
            case "Hello":
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
        }

        int dayOfTheWeek = 1;

        switch (dayOfTheWeek) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
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
            default:
                System.out.print("Invalid number");
                break;
        }

    }

}
