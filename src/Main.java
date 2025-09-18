public static void main(String[] args) {
    IO.println("ATM is open, activity...");
    BankAccount bankAccount = new BankAccount();
    

        Thread bankActivity = new Thread(() ->
        {
            for (int i = 0; i < 5; i++) {
                bankAccount.deposit(100);
                IO.println(bankAccount.getBalance());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        bankActivity.start();

    Thread bankActivityWithdraw = new Thread(() ->
    {
        for (int i = 0; i < 3; i++) {
            bankAccount.withdraw(200);
            IO.println(bankAccount.getBalance());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    });
    bankActivityWithdraw.start();


}