package com;

public class App {
   
    public static void main(String[] args) {
        Account c = new Account(1, "Sergio", 200);
        
        IAccount accountProxy = new AccountProxy();
        accountProxy.showBalance(c);
        c = accountProxy.putMoney(c, 100);
        c = accountProxy.withdrawMoney(c, 20);
        accountProxy.showBalance(c);
    }
}
