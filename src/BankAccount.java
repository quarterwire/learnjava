public class BankAccount {

    private float balance = 1000.0F;

    public synchronized void deposit(float amount) {
        float newBalance = balance + amount;

        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e) {
            IO.println("Canceled job");
        }

        balance = newBalance;
        IO.println("Deposited $" + amount + ", Balance: $" + balance);
    }

    public synchronized void withdraw(float amount) {

        if (amount > balance) {
            IO.println("Insufficient funds for withdrawal of $" + amount);
        }
        float newBalance = balance - amount;

        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e) {
            IO.println("Canceled job");
        }

        balance = newBalance;
        IO.println("Withdrawn $" + amount + ", Balance: $" + balance);
    }

    public float getBalance() {
        return balance;
    }
}

