import java.util.Arrays;
import java.util.Scanner;
//1. Создайте массив целых чисел. Удалите все вхождения заданного
//числа из массива.
//Пусть число задается с консоли (класс Scanner). Если такого числа нет -
//выведите сообщения об этом.
//В результате должен быть новый массив без указанного числа.
public class Task1v2 {

    public static void main(String[] args) {

        int[] arr = new int[]{10, 4, 1, 15, 6, 45, 1};

        Scanner userInput = new Scanner(System.in);
        System.out.println("enter the number");
        int n = userInput.nextInt();

// w - вхождения
        int w = 0;

        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            if (elem == n) {
                w = w + 1;
                System.out.println("yes");
            }
        }
        if (w == 0) {
            System.out.println("wrong");
            return;
        }

        if (w > 0) {
            int[] secondArray = new int[arr.length - w];
// на w вхождений будет меньше новый массив

            //цикл копирования

            for (int i = 0; i < secondArray.length; i++){
                int elem = arr[i];
                secondArray[i] = arr[i] ;

            }



            System.out.println(Arrays.toString(secondArray));
        }
    }
}









 //       System.arraycopy(arr, 0, secondArray, 0, arr.length);




