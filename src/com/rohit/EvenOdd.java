//Write a program to print whether a number is even or odd, also take input from the user.
package com.rohit;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number");
        int num=input.nextInt();
        if(num%2==0){
            System.out.println(num+" is even");
        }
        else{
            System.out.println(num+" is odd");
        }

        input.close();
    }
}
