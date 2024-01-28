package ARRAY;

public class ReversalArray {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,0};
        int n = array.length;

        for (int i = 0 ; i<n/2; i++){
            int temp;
            temp = array[i];
           array[i]= array[n-i-1];
            array[n-i-1]= temp;}


        for (int i =0;i<n;i++){
            System.out.println(array[i]);
        }
    }
}
