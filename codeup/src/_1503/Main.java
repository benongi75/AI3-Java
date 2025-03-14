package _1503;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int a = sc.nextInt();
        int arr[][] = new int[a][a];
        
        int x = 1;  // Variable for incrementing numbers
        boolean sw = true; // Switch for direction
        
        for (int i1 = 0; i1 < arr.length; i1++) {
            if (sw) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i1][j] = x++;
                }
            } else {
                for (int j = arr.length - 1; j >= 0; j--) {
                    arr[i1][j] = x++;
                }
            }
            sw = !sw; // Toggle direction
        }
        
        // Print the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
