public class Main {

    public static void main(String[] args) {

        CreditCard CreditCard1 = new CreditCard("first", 1000);
        CreditCard CreditCard2 = new CreditCard("second", 2000);
        CreditCard CreditCard3 = new CreditCard("third", 3000);


        CreditCard1.putmoney(500);
        CreditCard2.putmoney(500);
        CreditCard3.outmoney(100);


        CreditCard1.info();
        CreditCard2.info();
        CreditCard3.info();
    }
}
