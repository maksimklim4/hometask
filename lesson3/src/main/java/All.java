import java.util.Scanner;

public class All {
}
// Управляющие конструкции
// 1. Написать программу для вывода названия поры года по номеру
//месяца.
public class Task1 {

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

//2. Написать программу для вывода названия поры года по номеру
//месяца.
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
// 3. Напишите программу, которая будет принимать на вход число и на
//выход будет выводить сообщение четное число или нет.
//Для определения четности числа используйте операцию получения
//остатка от деления - операция выглядит так: '% 2').
public class Task3 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("enter the number");
        int number = userInput.nextInt();

        if (number % 2 == 0) {
            System.out.println("четное");
        }else{
            System.out.println("нечетное");

        }
    }
}
//4. Для введенного числа t (температура на улице) вывести
//Если t>–5, то вывести «Тепло».
//Если –5>= t > –20, то вывести «Нормально».
//Если –20>= t, то вывести «Холодно».

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
//Циклы
//1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
//При решении используйте операцию инкремента (++).
ublic class Task5 {
    public static void main(String[] args) {

        for (int i  = 1 ; i<100 ; i++ ){
            System.out.println(i++);
        }
        System.out.println("END");
    }
}
//2. Необходимо вывести на экран числа от 5 до 1.
//При решении используйте операцию декремента (--).
public class Task6 {
    public static void main(String[] args) {

        for (int i = 5; i>0 ; i-- ){

            System.out.println(i);
        }
        System.out.println("END");
    }

}
//3. Напишите программу, где пользователь вводит любое целое
//положительное число. А программа суммирует все числа от 1 до
//введенного пользователем числа.
//Для ввода числа воспользуйтесь классом Scanner.

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