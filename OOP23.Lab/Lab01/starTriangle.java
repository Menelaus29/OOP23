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
public class starTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = Integer.valueOf(scanner.nextLine());
        scanner.close();
        int cnt = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= cnt; k++) {
                System.out.print("*");
            }
            cnt += 2;
            System.out.println();
        }
    }
}
