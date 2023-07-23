public class Main {
    public static void main(String[] args) {
        Employee worker1 = new Worker("Anton", "Smith", 2);
        Employee worker2 = new Worker("Roman", "Chan", 5);
        Employee worker3 = new Worker("Wladimir", "Kruz", 1);
        Employee director1 = new Director("Mihail", "Johnson", 10);
        System.out.println(worker1.getName() + " " + worker1.getSurname() + " з/п: " + worker1.calculateSalary() );
        System.out.println(worker2.getName() + " " + worker2.getSurname() + " з/п: " + worker2.calculateSalary() );
        System.out.println(worker3.getName() + " " + worker3.getSurname() + " з/п: " + worker3.calculateSalary() );
        System.out.println(director1.getName() + " " + director1.getSurname() + " з/п: " + director1.calculateSalary() );
        //2.Назначить двух созданных сотрудников под управление директора. Распечатать сведения о директоре
        // (инфо о директоре и об его подчинении).
        Employee [] workers = new Employee[]{
                worker1, worker2};

        }
    }
}
