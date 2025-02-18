package com.example.demo.accounts;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankAccount {
    public  String username;
    public int password;
    public  double balance;
    public  String iBan;
    public  String phoneNumber;
    public  String name;
    public  String lastName;
    public  int age;
    public  String accountStatus;

    public BankAccount(String name, String lastName, int age,String username,int password, double balance, String iBan,String phoneNumber, String accountStatus){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.username = username;
        this.balance = balance;
        this.password = password;
        this.iBan = iBan;
        this.phoneNumber = phoneNumber;
        this.accountStatus = accountStatus;



    }

    @Override
    public String toString() {
        return "\n\n" + username + ":" + "\n\t" + "Name: " + name + " " + lastName +
                "\n\tAge: " + age +
                "\n\tBalance: " + balance +
                "\n\tIBAN: " + iBan +
                "\n\tPhone Number: " + phoneNumber +
                "\n\tAccount Status: " + accountStatus + "\n" +
                "--------------------------------------------\n";
    }
}

