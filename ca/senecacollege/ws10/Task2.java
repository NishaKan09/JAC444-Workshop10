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

public class Task2 {

    private static int n;
    private static int limit;
    private static int numOfBanksLoaned;
    private static int bankID;

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        boolean isSafe = false;

        System.out.print("Number of Banks: ");
        n = input.nextInt();

        System.out.print("Minimum Asset Limit: ");
        limit = input.nextInt();

        double[][] borrowers = new double[n][n];
        double[] total = new double[n];
        double[] balance = new double[n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n ; j++){
                borrowers[i][j] = 0;
                balance[i] = 0;
            }

            System.out.println("For Bank # " + i);
            System.out.print("Balance: ");
            balance[i] = input.nextDouble();

            System.out.println("Number of banks Loaned: ");
            numOfBanksLoaned = input.nextInt();

            for (int k = 0; k < numOfBanksLoaned; k++) {
                System.out.println("Bank ID who gets the loan: ");
                bankID = input.nextInt();
                System.out.println("Loaned Amount: ");
                borrowers[i][bankID] = input.nextDouble();
            }

        }

        while(!isSafe){
            isSafe = true;

            for(int i = 0; i < n; i++){
                if(balance[i] > 0){
                    total[i] = balance[i];

                    for(int j = 0; j < n; j++) {
                        total[i] += borrowers[i][j];
                    }

                    if(total[i] < limit){
                        isSafe = false;
                        balance[i] = 0;

                        for (int k = 0; k < n; k++) {
                            borrowers[k][i] = 0;
                        }
                    }
                }
            }
        }

        System.out.println("Unsafe banks are: ");
        for(int i = 0; i < n; i++){
            if(total[i] < limit){
                System.out.println("Bank " + i + " ");
            }
        }
    }
}
