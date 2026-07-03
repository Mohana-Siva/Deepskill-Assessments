package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                BankAccount account = new BankAccount();

                account.withdraw(700);   // Warning + Info
                account.withdraw(1000);  // Error
    }
}