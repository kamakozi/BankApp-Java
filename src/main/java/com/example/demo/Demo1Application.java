package com.example.demo;

import com.example.demo.controller.Login;
import com.example.demo.controller.Register;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.InputMismatchException;
import java.util.Scanner;


@SpringBootApplication
public class Demo1Application {


    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
        Scanner scanner = new Scanner(System.in);
        try {
            int chooser = 0;
            System.out.println("Welcome to zoric Bank!");
                while(chooser != 3) {
                    System.out.print("1.Login\n2.Register\n3.Exit\nSelect: ");
                    chooser = scanner.nextInt();
                    switch (chooser) {
                        case 1:
                            Login.login();
                            break;
                        case 2:
                            Register.register();
                            Register.showUsers();
                            break;
                        case 3:
                            System.out.println("Have a nice day! Exiting...");

                            break;
                        default:
                            System.out.println("Only numbers from 1-2!");
                            break;
                    }
        }
        }catch (InputMismatchException e){
                System.err.println("Chooser is not a number! input in valid!");

        }
    scanner.close();


    }




}
