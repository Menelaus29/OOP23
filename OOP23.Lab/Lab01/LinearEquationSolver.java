/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

import java.util.Scanner;
public class LinearEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = Double.valueOf(scanner.nextLine());
        System.out.println("Enter b: ");
        double b = Double.valueOf(scanner.nextLine());
        scanner.close();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinite solution!");
            } else {
                System.out.println("No solution!");
            }
        } else {
            System.out.println("x equals " + (double)(-b/a));
        }
    }
}
