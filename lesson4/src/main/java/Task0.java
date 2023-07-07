import java.util.Arrays;
import java.util.Scanner;

public class Task0 {

    public static void main(String[] args) {

        int[] arr = new int[]{10, 4, 15, 6, 45, 1};

        Arrays.sort(arr);

        Scanner userInput = new Scanner(System.in);
        System.out.println("enter the number");
        int n = userInput.nextInt();

        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];

            if (elem == n) {
                System.out.println("found");
                break;
            }

            if (elem != n) {
                System.out.println("not found");
                break;
            }

            }
        }
    }
