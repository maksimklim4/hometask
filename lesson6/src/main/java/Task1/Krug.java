package Task1;

public class Krug extends Figura{

    private double radius;

    //konstruktor

    public Krug(double radius) {
        this.radius = radius;
    }


    double perimetr(){
        return 2 * 3.14 * radius;
    }

    double area(){
        return 3.14 * radius * radius;
    }
}
