package ARRAY;
import java.util.*;
import  java.io.*;

public class RotationMatrix {
    public static void rotationMatrix(int[][] arr){
        //step 1: transpose the 2d array

        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0;i<m; i++){
            for (int j = i; j<n;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //step 2: swap the left and right side elements

        for (int i = 0 ; i <m ;i++){
            int leftL = 0;
            int rightL = n-1;

            while (leftL <rightL){
            int temp = arr[i][leftL];
                arr[i][leftL] =  arr[i][rightL];
                arr[i][rightL]  = temp;
                leftL ++;
                rightL--;

            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        rotationMatrix(arr);
        for (var mat : arr){
            System.out.println(Arrays.toString(mat));
        }
    }
}
