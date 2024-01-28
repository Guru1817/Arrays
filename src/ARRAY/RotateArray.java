package ARRAY;
/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */

public class RotateArray {
    public void reverse(int[] arr, int left , int right){
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public void rotate(int arr[], int k){
        int n = arr.length;
        k %= n;
        reverse(arr , 0 , n-k-1);
        reverse(arr , n-k , n-1);
        reverse(arr,0 , n-1);

        for (int i = 0 ; i < n ; i++){
            System.out.print(arr[i]);
        }

    }
   public static void main(String[] args ){
       RotateArray ar =  new RotateArray();
       int arr[] = {1,2,3,4,5,6,7};
       int k = 4;
       ar.rotate(arr , k);


   }
}
