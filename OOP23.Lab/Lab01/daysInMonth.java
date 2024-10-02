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

public class daysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Month?");
        String input = scanner.nextLine();
        System.out.println("Year?");
        int year = scanner.nextInt();
        scanner.close();

        if (input.equals("January") || input.equals("Jan.") || input.equals("Jan") || input.equals("1")) {
            System.out.println("31");
        } else if (input.equals("March") || input.equals("Mar.") || input.equals("Mar") || input.equals("3")) {
            System.out.println("31");
        } else if (input.equals("April") || input.equals("Apr.") || input.equals("Apr") || input.equals("4")) {
            System.out.println("30");
        } else if (input.equals("May") || input.equals("5")) {
            System.out.println("31");
        } else if (input.equals("June") || input.equals("Jun") || input.equals("6")) {
            System.out.println("30");
        } else if (input.equals("July") || input.equals("Jul") || input.equals("7")) {
            System.out.println("31");
        } else if (input.equals("August") || input.equals("Aug.") || input.equals("Aug") || input.equals("8")) {
            System.out.println("31");
        } else if (input.equals("September") || input.equals("Sep.") || input.equals("Sep") || input.equals("9")) {
            System.out.println("30");
        } else if (input.equals("October") || input.equals("Oct.") || input.equals("Oct") || input.equals("10")) {
            System.out.println("31");
        } else if (input.equals("November") || input.equals("Nov.") || input.equals("Nov") || input.equals("11")) {
            System.out.println("30");
        } else if (input.equals("December") || input.equals("Dec.") || input.equals("Dec") || input.equals("12")) {
            System.out.println("31");
        } else if (input.equals("February") || input.equals("Feb.") || input.equals("Feb") || input.equals("2")) {
            if (isLeapYear(year)) {
                System.out.println("29");
            } else {
                System.out.println("28");
            }
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

