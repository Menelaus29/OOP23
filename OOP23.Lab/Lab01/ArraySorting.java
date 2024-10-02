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
import java.util.*;
public class ArraySorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        System.out.println("Enter the size of array: ");
        int size = Integer.valueOf(scanner.nextLine());
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.valueOf(scanner.nextLine());
        }
        scanner.close();
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        double avg = sum/size;
        System.out.println("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
