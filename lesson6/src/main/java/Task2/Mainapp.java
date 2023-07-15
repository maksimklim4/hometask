package Task2;

public class Mainapp {

    public static void main(String[] args) {

       Position director = new Director();
       String directorposition = director.myPosition();
       System.out.println(directorposition);

       Position accountant = new Accountant();
       String accountantposition = accountant.myPosition();
       System.out.println(accountantposition);

        Position worker = new Worker();
        String workerposition = worker.myPosition();
        System.out.println(workerposition);

    }
}
