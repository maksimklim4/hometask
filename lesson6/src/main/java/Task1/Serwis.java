package Task1;

public class Serwis {


   public double getSumPerimetr(Figura... figurs) {

        double result = 0;

        for (Figura abcd : figurs) {
            result = result + abcd.perimetr();
        }
        return result;
    }
}