package com.klinux.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        assertEquals(100, account.getBalance(), "El saldo después de depositar debe ser 100");
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount();
        account.deposit(200);
        account.withdraw(100);
        assertEquals(100, account.getBalance(), "El saldo después de retirar debe ser 100");
    }

    @Test
    public void testBalanceCannotBeNegative() {
        BankAccount account = new BankAccount();
        account.deposit(50);
        account.withdraw(100);
        assertEquals(50, account.getBalance(), "El saldo no debe ser negativo");
    }
}
