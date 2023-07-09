import java.util.Arrays;
import java.util.Scanner;
//2. Создайте и заполните массив случайным числами и выведете
//максимальное, минимальное и среднее значение.
//Для генерации случайного числа используйте метод Math.random().
//Пусть будет возможность создавать массив произвольного размера.
//Пусть размер массива вводится с консоли.
public class Task2 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("enter the number");
        int n = userInput.nextInt();

        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Math.random();}

        System.out.println(Arrays.toString(arr));

        double max = arr[0];
        double min = arr[0];
        double allsum = arr[0];

        for (int i = 0; i < n; i++) {

            if (arr[i] > max) {
                max = arr[i];}

            if (arr[i] < min) {
                min = arr[i];}

            allsum = allsum + arr[i];
        }
            double medium = allsum / n;

            System.out.println("max " +  max);
            System.out.println("min "  +  min);
            System.out.println("srednee " +  medium);
        }
}

