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
public class SecondDegreeEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b, c respectively: ");
        double a = Double.valueOf(scanner.nextLine());
        double b = Double.valueOf(scanner.nextLine());
        double c = Double.valueOf(scanner.nextLine());
        scanner.close();
        
        double delta = (double)(b*b - 4*a*c);
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Infinite solution!");
                } else {
                    System.out.println("No solution!");
                }
            }
            System.out.println("x equals: " + (double)(-c/b));
        } else {
            if (delta < 0) {
                System.out.println("No solution!");
            } else if (delta == 0) {
                double x = (-b)/(2*a);
                System.out.println("x equals: " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("x1 equals: " + x1);
                System.out.println("x2 equals: " + x2);
            }
        }
    }
}
