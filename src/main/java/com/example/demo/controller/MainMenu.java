package com.example.demo.controller;

import com.example.demo.accounts.BankAccount;


import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    static Scanner scanner = new Scanner(System.in);


    public static void mainMenu(BankAccount loggedinAcc)
    {
        System.out.println("\n\nWelcome " + loggedinAcc.username);
        int chooser = 0;
        while(chooser != 4){
            System.out.println("\nChose an action: ");
            System.out.println("----------------------------");
            System.out.println("\n1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");

            chooser = scanner.nextInt();


            switch (chooser){
                case 1:
                    deposit(loggedinAcc);
                    break;
                case 2:
                    withdraw(loggedinAcc);
                    break;

                case 3:
                    checkBalance(loggedinAcc);
                    break;
                case 4:
                    System.out.println("Have a nice day!. Exiting...");
                    break;
            }
        }
    }

    public static double withdraw(BankAccount loggedinAcc){
        try {
            System.out.println("\nEnter withdraw amount: ");
            double withdrawAmount = scanner.nextDouble();
            if(withdrawAmount > loggedinAcc.balance)
            {
                System.out.println("Withdrawl excedes the balance!");
            }
            loggedinAcc.balance -= withdrawAmount;

            System.out.println("\nNew balance is: " + loggedinAcc.balance + "€");
            return loggedinAcc.balance;
        } catch (Exception e) {
            System.err.println("Withdraw function not executing correctly!");
            throw new RuntimeException(e);
        }
    }


    public static double deposit(BankAccount loggedinAcc){
        try {
            System.out.print("How much would you like to deposit: ");
            double depositAmount = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("You want do deposit " + depositAmount + ". (Yes/No)");
            String confirm = scanner.nextLine();
            if (confirm.equals("yes") || confirm.equals("YES") || confirm.equals("Yes")){
                loggedinAcc.balance += depositAmount;
                System.out.println("Your new balance is " + loggedinAcc.balance + "€");
                return loggedinAcc.balance;
            }else{
                System.out.println("Action canceled!");
            }
        }catch(InputMismatchException e){
            System.out.println("Unknown operator!Please type only numbers!");
        }
        return 0;
    }

    public static double checkBalance(BankAccount loggedinAcc)
    {
        System.out.println("\nBalance is: " + loggedinAcc.balance + "€");
        return loggedinAcc.balance;
    }

}
