/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.algorithms.java2darray;
import java.util.*;
/**
 *
 * @author nnduc
 */
public class Java2DArray {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                          + arr[i+1][j+1]
                          + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
        scanner.close();
    }
}
