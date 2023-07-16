package Task1;

public class Treugolnik extends Figura{

    private double side1;
    private double side2;
    private double side3;

    //konstruktor
    public Treugolnik(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double perimetr(){
        return (side1 + side2 + side3);
    }

    double area(){
        return Math.sqrt(perimetr/2*(perimetr/2 - side1)*(perimetr/2 - side2)*(perimetr/2 - side3));
    }
}
