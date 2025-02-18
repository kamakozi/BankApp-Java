package com.example.demo.controller;

import com.example.demo.accounts.BankAccount;

import java.util.Scanner;

import static com.example.demo.controller.Register.accounts;

public class Login {


    public static void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Login bank!");

        BankAccount loggedIn = null;
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        for (BankAccount acc : accounts) {
            if(acc.getUsername().equals(username)){
                System.out.print("Enter your password: ");
                int password = scanner.nextInt();
                if(acc.getPassword() == password){
                    loggedIn = acc;
                    MainMenu.mainMenu(loggedIn);
                    break;
                }else{
                    System.out.println("Password and username do not match!");
                    break;
                }

            }else{
                System.out.println("Account not found!");
                break;
            }
        }



    }
}
