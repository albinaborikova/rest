package rest;

import java.util.Scanner;

public class calculator {
    public double first_n;
    public double second_n;


    public  static double sum( double first_n, double second_n){
        return first_n+second_n;
    }

    public static double mult(double first_n, double second_n){
        return first_n*second_n;
    }

    public static double diff( double first_n, double second_n){
        return first_n-second_n;
    }

    public static double quotient( double first_n, double second_n){
       if(second_n!=0) return first_n/second_n;
       else return Integer.MAX_VALUE;
    }


    public static void main(String[] args) {
        char op;
        double a;
        double b;
        double ans;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        a = reader.nextDouble();
        b = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch(op) {
            case '+':
                ans = sum(a, b);
                break;
            case '-':
                ans = diff(a, b);
                break;
            case '*':
                ans = mult(a, b);
                break;
            case '/':
                ans = quotient(a, b);
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                return;

        }


        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(a + " " + op + " " + b + " = " + ans);
    }

}
