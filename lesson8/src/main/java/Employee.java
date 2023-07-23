public abstract class Employee {
    private String name;
    private String surname;
    private Position position;
    private int experience;
   //конструктор
    public Employee(String name, String surname, Position position, int experience) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.experience = experience;
    }
    // з/п = базовая_ставка * коэффициент * стаж. Базовая ставка у каждого своя в класе
    public abstract int getBaseSalary();
    public double calculateSalary(){
        double salary = getBaseSalary() * position.getCoefficient() * experience;
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
}



