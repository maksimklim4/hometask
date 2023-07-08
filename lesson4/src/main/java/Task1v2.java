import java.util.Arrays;
import java.util.Scanner;

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
if (w == 0){
    System.out.println("wrong");
    return;
}


        int[] secondArray = new int[arr.length-w];
// на w вхождений будет меньше новый массив

        // x индекс числа в масссиве
        int x =0;

       for (int i = 0; i < arr.length; i++) {
           int elem = arr[i];
          if (elem != n) {
                secondArray[x] = arr[i];
                x++;
            }
        }


 //       System.arraycopy(arr, 0, secondArray, 0, arr.length);


        System.out.println(Arrays.toString(secondArray));
    }
    }

