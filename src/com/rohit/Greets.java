//Take name as input and print a greeting message for that particular name.
 package com.rohit;

import java.util.Scanner;

public class Greets {
   public static void main (String[] args){
       Scanner input=new Scanner(System.in);

       System.out.println("Enter your name:");
       String name =input.nextLine();

       String greeting = "Hello, " + name + "! Welcome to the Greeting Program.";
       System.out.println(greeting);

       input.close();
   }

}
