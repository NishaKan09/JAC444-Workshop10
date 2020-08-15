/********************************************************************************
 Workshop # 10
 Course: JAC444 - Semester 4
 Last Name: Kanagasapabathy
 First Name: Nishantha (Nisha)
 ID: 135015162
 Section: NB
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date: Aug 11th/2020
 *********************************************************************************/

package ca.senecacollege.ws10;

import java.util.Scanner;

public class Task1 {

    private static Scanner input = new Scanner(System.in);
    private static int hr;
    private static int min;
    private static int sec;
    private static long time;

    public static void main(String[] args) {

        System.out.print("Enter time1 (hour minute second): ");
        hr = input.nextInt();
        min = input.nextInt();
        sec = input.nextInt();

        Time time1 = new Time(hr, min, sec);

        System.out.println();
        System.out.println(time1);

        System.out.println("Elapsed seconds in time1: " + time1.getSeconds());
        System.out.println();
        System.out.println();

        System.out.print("Enter time2 (elapsed time in seconds): ");
        time = input.nextLong();

        Time time2 = new Time(time);

        System.out.println();
        System.out.println(time2);

        System.out.println("Elapsed seconds in time2: " + time2.getSeconds());
        System.out.println();
        System.out.println();

        System.out.println("time1.compareTo(time2)? " + time1.compareTo(time2));
        System.out.println();
        System.out.println();

        Time time3 = time1.clone();
        System.out.println("time3 is created as a clone of time1 time1.compareTo(time3)? " + time1.compareTo(time3));
    }
}

