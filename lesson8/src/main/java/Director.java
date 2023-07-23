public class Director extends Employee{
    private int baseSalary = 20000;
    private int numbersSubordinates;
    public Director(String name, String surname, int experience){
        super(name, surname, Position.DIRECTOR, experience);
    }
//метод назначения
    public void addSubordinates(Employe[] ) {

        this.numbersSubordinates = numbersSubordinates;
    }
    public int getBaseSalary() {
        return baseSalary;
    }
    @Override
    public double calculateSalary() {
       // double salary = getBaseSalary() * position.getCoefficient() * experience;
        // return salary;
        return getBaseSalary() * getPosition().getCoefficient() * getExperience() * ( numbersSubordinates * 0.15 +1);
    }
}
