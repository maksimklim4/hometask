public class CreditCard {

    private String nr;
    private int balance;

    public CreditCard(String nr, int balance) {
        this.nr = nr;
        this.balance = balance;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

public void putmoney (int money){
        if (money > 0) {
            balance = balance + money;
            System.out.println("на счет зачислено " + money + " - номер карты: " + nr);
        }else{
            System.out.println("на счету" + balance);
        }
    }

public void outmoney (int money){
         if (money > 0 && balance >= money) {
             balance = balance - money;
            System.out.println("со счета снято " + money + " - номер карты: " + nr);
         }else{
             System.out.println("ошибка - на счету" + balance);
         }
}

public void info(){
    System.out.println("номер карты " + nr + " баланс: " + balance);
}




}
