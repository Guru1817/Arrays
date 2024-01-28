package ARRAY;

public class palindrome {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        int n  = arr.length;
        int mid  = n/2;
        int flag = 0;
        for (int i = 0 ; i < mid ; i++){
            if (arr[i] != arr[n - i - 1]){
                flag =1;
                System.out.println("this is not a palindromic array");
                break;
            }
        }
        if (flag == 0) {
            System.out.println("this is a palindromic array ");
        }
    }
}
