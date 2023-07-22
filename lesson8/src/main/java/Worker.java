public class Worker extends Employee{
    private int baseSalary = 5000;
    public Worker(String name, String surname, int experience) {
        super(name, surname, getPosition().WORKER, experience);
    }
    public int getBaseSalary() {
        return baseSalary;
    }
}
