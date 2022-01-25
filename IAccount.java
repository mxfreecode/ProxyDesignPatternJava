package com;
public interface IAccount {
 
    Account withdrawMoney(Account account, double amount);
    Account putMoney(Account account, double amount);
    void showBalance(Account account);
}
