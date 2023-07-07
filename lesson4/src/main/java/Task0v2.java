import java.util.Scanner;

public class Task0v2 {
    public static void main(String[] args) {

        int[] arr = new int[]{10, 4, 15, 6, 45, 1};

        Scanner userInput = new Scanner(System.in);
        System.out.println("enter the number");
        int n = userInput.nextInt();

        for (int el : arr ) {

            if (el == n) {
                System.out.println("found");
            }

            if (el != n) {
                System.out.println("not found");
            }

        }
    }
}