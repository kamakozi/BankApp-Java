package com.example.demo.controller;

import com.example.demo.accounts.BankAccount;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Register {
    static Scanner scanner = new Scanner(System.in);
    static List<BankAccount> accounts = new ArrayList<>();

    public static void register(){

        while(true) {

            System.out.println("Welcome to register!");

            String accountStatus;
            System.out.print("Enter your full name: ");
            String fullName = scanner.nextLine();
            if (fullName.isEmpty()) {
                System.out.println("Full name can't be empty!");
                break;
            }

            System.out.println("Please enter your username: ");

            String username = scanner.nextLine();
            if (username.trim().isEmpty()) {
                System.out.println("Username can't be empty!");
                break;
            }

            System.out.print("How old are you?: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            if (age < 11) {
                System.out.println("You are unable to create the bank account!");
                break;
            } else if (age < 18 && age >= 12) {
                System.out.println("Account status: Youngster was created!");
                accountStatus = "Youngster";
            } else {
                System.out.println("Account status: Normal was created!");
                accountStatus = "Normal";
            }

            System.out.print("Now set up password! 4 Numbers!\n Select: ");
            String password = String.valueOf(scanner.nextInt());
            scanner.nextLine();
            int newPassword;
            if (password.length() == 4) {
                System.out.println("Account saved!");
                newPassword = Integer.parseInt(password);

            } else {
                System.out.println("Password must contain 4 numbers!");
                break;
            }


            System.out.print("Enter you phone number: ");
            String phoneNumber = scanner.nextLine();
            if (phoneNumber.isEmpty()) {
                System.out.println("Field can't be empty");
                break;
            }

            System.out.println("Account created!");


            Random random = new Random();
            StringBuilder complete = new StringBuilder();


            for (int i = 0; i < 15; i++) {
                int randomNumber = random.nextInt(10);
                complete.append(randomNumber);
            }


            String iBan = complete.toString();
            String name = fullName.split(" ")[0];
            String lastName = fullName.split(" ")[1];




            BankAccount newUser = new BankAccount(name, lastName, age, username, newPassword, 0, iBan, phoneNumber, accountStatus);


            accounts.add(newUser);

            break;
        }

    }
    public static void showUsers(){
        for (int i = 0 ; i < accounts.size(); i++){
            System.out.println(accounts.get(i));
        }
    }
}


    /*
    public static void all(){
        System.out.println("\nAll users: \n");
        if(accounts.isEmpty())
        {
            System.out.println("not registerd");
        }else{
            for (BankAccount account : accounts) {
                System.out.println(account.toString());
            }
        }
    }

     */

    /*
    public static boolean isRegistered() {
        try {
            for(BankAccount i : accounts){
                if(i.equals(BankAccount.username)){
                    System.out.println("User is already registered!!");
                    return true;
                }else{
                    return false;
                }

            }
            if(accounts.isEmpty()){
                System.err.println("\nNo registerd accounts!!!");
                System.out.println("Please create an account!");
                return false;
            }else{
                return true;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

     */
