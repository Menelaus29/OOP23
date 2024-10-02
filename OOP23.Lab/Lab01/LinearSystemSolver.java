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
public class LinearSystemSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a1, b1, c1 respectively: ");
        double a1 = Double.valueOf(scanner.nextLine());
        double b1 = Double.valueOf(scanner.nextLine());
        double c1 = Double.valueOf(scanner.nextLine());
        System.out.println("Enter a2, b2, c2 respectively: ");
        double a2 = Double.valueOf(scanner.nextLine());
        double b2 = Double.valueOf(scanner.nextLine());
        double c2 = Double.valueOf(scanner.nextLine());
        scanner.close();
        
        double det = a1 * b2 - a2 * b1;
        double detX = b2 * c1 - b1 * c2;
        double detY = c2 * a1 - c1 * a2;
        
        if (det != 0) {
            System.out.println("x equals: " + (double)(detX/det));
            System.out.println("y equals; " + (double)(detY/det));
        } else if (detX == 0 || detY == 0) {
            System.out.println("Infinite solution!");
        } else {
            System.out.println("No solution!");
        }
    }
}
