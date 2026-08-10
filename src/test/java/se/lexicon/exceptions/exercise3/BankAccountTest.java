package se.lexicon.exceptions.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BankAccountTest {

    @Test
    void depositsAndWithdrawsMoney() throws InsufficientBalanceException {
        BankAccount account = new BankAccount(100);

        account.deposit(50);
        account.withdraw(25);

        assertEquals(125, account.getBalance(), 0.001);
    }

    @Test
    void withdrawalAboveBalanceThrowsCustomExceptionWithoutChangingBalance() {
        BankAccount account = new BankAccount(100);

        InsufficientBalanceException exception = assertThrows(
                InsufficientBalanceException.class,
                () -> account.withdraw(150));

        assertEquals(100, exception.getBalance(), 0.001);
        assertEquals(150, exception.getWithdrawalAmount(), 0.001);
        assertEquals(100, account.getBalance(), 0.001);
    }

    @Test
    void nonPositiveAmountsAreRejected() {
        BankAccount account = new BankAccount(100);

        assertThrows(IllegalArgumentException.class, () -> account.deposit(0));
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-10));
    }
}

