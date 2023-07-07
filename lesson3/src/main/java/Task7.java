import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("enter the number");
        int n = userInput.nextInt();

        int s = 0;

        if (n < 0) {
            System.out.println("wrong");
        }

for( int i = 1; i <= n ; i++ ) {
    s = s + i;}

    System.out.println(s);
        }
        }


