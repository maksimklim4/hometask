import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
        //поры года по номеру switch case + scanner
        Scanner userInput = new Scanner(System.in);
        System.out.println("choose nr of month");
        int m = userInput.nextInt();

        switch (m) {
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("autumn");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            default:
                System.out.println("wrong");
            }

            System.out.println("END");
        }
}
// поры года по номеру if-else-if + scanner
Scanner userInput = new Scanner(System.in);
        System.out.println("choose nr of month");
                int m = userInput.nextInt();

                if (m == 1) {
                System.out.println("winter");
                }else if (m == 2) {
                System.out.println("winter");
                }else if (m == 3) {
                System.out.println("spring");
                }else if (m == 4) {
                System.out.println("spring");
                }else if (m == 5) {
                System.out.println("spring");
                }else if (m == 6) {
                System.out.println("summer");
                }else if (m == 7) {
                System.out.println("summer");
                }else if (m == 8) {
                System.out.println("summer");
                }else if (m == 9) {
                System.out.println("autumn");
                }else if (m == 10) {
                System.out.println("autumn");
                }else if (m == 11) {
                System.out.println("winter");
                }else if (m == 12) {
                System.out.println("winter");
                }else if (m > 12) {
                System.out.println("wrong");
                }else if (m < 1) {
        System.out.println("wrong");
        }
        System.out.println("END");
        }
        }
        //четное число или нет

