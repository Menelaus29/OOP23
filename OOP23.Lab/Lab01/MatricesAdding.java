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
public class MatricesAdding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers of rows and columns of the matrices, respectively: ");
        int row = Integer.valueOf(scanner.nextLine());
        int col = Integer.valueOf(scanner.nextLine());
        int[][] firstMatrix = new int[row][col];
        int[][] secondMatrix = new int[row][col];
        int[][] sumOfMatrices = new int[row][col];
        System.out.println("Define the first matrix, row by row, from left to right: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                firstMatrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Define the second matrix, row by row, from left to right: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                secondMatrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sumOfMatrices[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        System.out.println("The sum of matrices is: "); 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sumOfMatrices[i][j] + " ");
            }
            System.out.println();
        }
    }
}
