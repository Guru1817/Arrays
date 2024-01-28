package ARRAY;

public class MissingElement {
    public static void main(String[] args) {
        int []array = {2,4,5,7,6,3,1,9};
        int n = array.length;
        int sumOfNeturalMun = (n+1)*(n+2)/2;
        int sum = 0;

        for (int i = 0; i<n; i++){
            sum = sum+array[i];
        }
        System.out.println(sumOfNeturalMun -sum);
    }
}
