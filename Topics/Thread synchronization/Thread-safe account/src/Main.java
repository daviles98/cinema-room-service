class Account {

    private long balance = 0;

    public synchronized boolean withdraw(long amount) {
        boolean withdrawPossible = this.balance >= 0 ? true: false;
        if (withdrawPossible) {
            this.balance -= amount;
        }
        return withdrawPossible;
    }

    public synchronized void deposit(long amount) {
        this.balance += amount;
    }

    public long getBalance() {
        return this.balance;
    }
}