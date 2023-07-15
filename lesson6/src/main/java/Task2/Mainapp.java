package Task2;

public class Mainapp {

    public static void main(String[] args) {

       Position director = new Director();
       System.out.println(director.myPosition());

       Position accountant = new Accountant();
       System.out.println(accountant.myPosition());

        Position worker = new Worker();
        System.out.println(worker.myPosition());

    }
}
