public class Account {
    // instance variable
    private int balance;

    public void setBalance(int balance) {
        if (balance < 0)
            return;

        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }
}
