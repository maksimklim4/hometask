package Task1;

public class Main {

    public static void main(String[] args) {

        Figura figura1 = new Treugolnik(5, 6, 3);
        Figura figura2 = new Priamougolnik(4, 5);
        Figura figura3 = new Krug(2);
        Figura figura4 = new Treugolnik(10, 10, 10);
        Figura figura5 = new Priamougolnik(8, 2);

        Serwis serwis = new Serwis();
        double result = serwis.getSumPerimetr(figura1,figura2,figura3,figura4,figura5);
        System.out.println(result);
    }
}
