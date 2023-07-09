import java.util.Arrays;

//3. Создайте 2 массива из 5 чисел.
//Выведите массивы на консоль в двух отдельных строках.
//Посчитайте среднее арифметическое элементов каждого массива и
//сообщите, для какого из массивов это значение оказалось больше (либо
//сообщите, что их средние арифметические равны).
public class Task3 {

    public static void main(String[] args) {

        int[] arr1 = new int[]{10, -4, 6, 45, 1};

        int[] arr2 = new int[]{8, 5, 90, 23, 65};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int n = 0;
        int summa1 = 0;
        int summa2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            summa1 = summa1 + arr1[i];
        }

        int sr1 = summa1 / arr1.length;

        for (int i = 0; i < arr2.length; i++) {
            summa2 = summa2 + arr2[i];
        }

        int sr2 = summa2 / arr2.length;

        System.out.println("sr1 " +  sr1);
        System.out.println("sr2 " +  sr2);

        if (sr1 > sr2){
            System.out.println("Среднее больше в первом массиве");
        }
        if (sr1 < sr2){
            System.out.println("Средне больше во втором массиве");
        }
        }
    }

