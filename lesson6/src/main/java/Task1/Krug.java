package Task1;

public class Krug extends Figura{

    private double radius;

    //konstruktor

    public Krug(double radius) {
        this.radius = radius;
    }


    public double perimetr(){
        return 2 * 3.14 * radius;
    }

    public double area(){
        return 3.14 * radius * radius;
    }
}
