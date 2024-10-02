/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
package OOP23.Lab01;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        double val1 = Double.valueOf(scanner.nextLine());
        System.out.println("Second number?");
        double val2 = Double.valueOf(scanner.nextLine());
        scanner.close();
        
        System.out.println("Sum of 2 numbers: " + (double)(val1 + val2));
        System.out.println("Difference of 2 numbers: " + (double)(val1 - val2));
        System.out.println("Product of 2 numbers: " + (double)(val1 * val2));
        System.out.println("Quotient of 2 numbers: " + ((val1 * 1.0)/val2));
    }
}
