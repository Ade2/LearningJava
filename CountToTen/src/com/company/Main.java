package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter the staring number: ");
        int count = reader.nextInt();

        System.out.println("Please enter the finishing number: ");
        int finish = reader.nextInt();
        finish = finish+1;

        //int count = 1;

        while (count <finish) {
            System.out.println(count);
            count++;
        }

//
//        for (int forCount =1; forCount<11; forCount++){
//            System.out.println(forCount);
//        }

    }
}
