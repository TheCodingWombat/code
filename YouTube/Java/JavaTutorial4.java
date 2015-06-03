import java.util.Scanner;

public class JavaTutorial4 {

    public static void main(String[] args) {

        String startMessage;
        startMessage = "Welcome!";
        System.out.println(startMessage);

        Scanner userInput = new Scanner(System.in);

        String name = "";
        int age = 0;

        System.out.print("Enter age: ");

        if (userInput.hasNextInt()) {
            age = userInput.nextInt();
        } else {
            System.out.println("Enter int next time");
        }

        System.out.print("ENter name: ");

        userInput.nextLine();
        if (userInput.hasNext()) {
            name = userInput.next();
        }

        System.out.println(name + " " + age);

    }

}
