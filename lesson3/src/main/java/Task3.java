import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("enter the number");
        int number = userInput.nextInt();

        if (number % 2 == 0) {
            System.out.println("четное");
        }else{
                System.out.println("нечетное");

        }
    }
}
