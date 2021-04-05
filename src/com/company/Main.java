package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("number 1: Print the rectangle");
        System.out.println("number 2: Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("number 3: Print isosceles triangle");
        System.out.println("number 4: Tam giac can");
        System.out.println("number 0: Exit");
        int number = sc.nextInt();
        switch (number){
            case 1:
                for (int i =0; i<3 ; i++ ){
                    for(int j = 0; j<7 ; j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                for (int i = 0 ; i<5 ; i++ ){
                    for(int j=0 ; j<=i ; j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for (int i = 5; i >= 0 ; i--){
                    for (int j = 0 ; j < i  ; j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 4:
                for (int i =1 ; i <= 5 ; i++){
                    for (int j =1 ; j <= 5*2 ; j++ ){
                        if((Math.abs(5 - j)) <= (i - 1)){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 0:
                break;
        }
    }
}
