package se.lexicon.exceptions.exercise3;

public class InsufficientBalanceException extends Exception {

    private final double balance;
    private final double withdrawalAmount;

    public InsufficientBalanceException(double balance, double withdrawalAmount) {
        super("Cannot withdraw %.2f. Available balance is %.2f."
                .formatted(withdrawalAmount, balance));
        this.balance = balance;
        this.withdrawalAmount = withdrawalAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }
}

