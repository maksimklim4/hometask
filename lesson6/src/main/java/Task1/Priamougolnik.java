package Task1;

public class Priamougolnik extends Figura{

    private double sideA;
    private double sideB;

    //konstruktor

    public Priamougolnik(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    public double perimetr(){
        return (sideA + sideB)*2;
}

    public double area(){
        return sideA * sideB;
}
}
