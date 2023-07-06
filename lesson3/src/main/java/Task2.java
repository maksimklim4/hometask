import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

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
