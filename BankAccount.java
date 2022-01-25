package com;

public class BankAccount implements IAccount{
    
    @Override
    public Account withdrawMoney(Account account, double amount)
    {
        double recentBalance = account.getInitialBalance() - amount;
        account.setInitialBalance(recentBalance);
        System.out.println("Actual Balance: " + account.getInitialBalance());
        return account;
    }
    @Override
    public Account putMoney(Account account, double amount)
    {
        double recentBalance = account.getInitialBalance() + amount;
        account.setInitialBalance(recentBalance);
        System.out.println("Actual Balance: " + account.getInitialBalance());
        return account;
    }

    @Override
    public void showBalance(Account account)
    {
        System.out.println("Actual Balance: " + account.getInitialBalance());
    }

}
