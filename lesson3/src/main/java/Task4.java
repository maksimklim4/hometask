import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter the temp");
        int t = userInput.nextInt();

        if (t > -5) {
            System.out.println("Тепло");
        }
        else if (t < -20 ) {
                System.out.println("Холодно");
            }

                else{
                    System.out.println("Нормально");
                }
            }
        }



