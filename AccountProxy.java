package com;

public class AccountProxy implements IAccount {
  
    private BankAccount accountReal;

    @Override
    public Account withdrawMoney(Account account, double amount)
    {
        if(accountReal == null)
        {
            accountReal = new BankAccount();
            return accountReal.withdrawMoney(account, amount);
        }else{
            return accountReal.withdrawMoney(account, amount);
        }
    }

    @Override
    public Account putMoney(Account account, double amount)
    {
        if(accountReal == null)
        {
            accountReal = new BankAccount();
            return accountReal.putMoney(account, amount);
        }else{
            return accountReal.putMoney(account, amount);
        }
    }
    @Override
    public void showBalance(Account account)
    {
        if(accountReal == null)
        {
            accountReal = new BankAccount();
            accountReal.showBalance(account);
        }else{
            accountReal.showBalance(account);
        }
    }
}
