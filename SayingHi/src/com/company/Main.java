package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner reader = new Scanner(System.in);
//        System.out.print("Hi, whats your name?");
//        String name = reader.next();
//        System.out.println("Hi " +name + " , nice to meet you!");

        Scanner whatever = new Scanner(System.in);
        System.out.print("Hi, whats your name?");
        String name = whatever.next();

        if(name.equalsIgnoreCase("bob")){
            System.out.println("Hey Bob, welcome back");
        }else if (name.equalsIgnoreCase("tim")) {
            System.out.println("What you doing looking at mycode :)");
        } else {
            System.out.println("Hi " + name + ", nice to meet you!");
        }


    }
}
