public class Director extends Employee{
    private int baseSalary = 20000;
    private int numbersSubordinates;
    public Director(String name, String surname, int experience){
        super(name, surname, getPosition().DIRECTOR, experience);
    }

    public void addSubordinates(int numbersSubordinates) {
       this.numbersSubordinates = numbersSubordinates;
    }
    public int getBaseSalary() {
        return baseSalary;
    }
    public double calculateSalary() {
       // double salary = getBaseSalary() * position.getCoefficient();
        return getBaseSalary() * getPosition().getCoefficient() * getExperience() * ( numbersSubordinates * 0.15 +1);
    }
}
