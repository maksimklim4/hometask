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



}
