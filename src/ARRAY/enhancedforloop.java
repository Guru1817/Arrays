package ARRAY;

public class enhancedforloop {
    public static void main(String[] args) {

        int[] a = {23,3,3,5,6787,9,9};

        for (int b : a){
            System.out.println(b);
        }

        System.out.println("       ");

        int[][] n = {{1,3,23,434},{6,67,57,5,5},{5,34,3},{12,2}};

        for (int[] m : n){
            for (int v : m){
                System.out.print(v);
            }
            System.out.println();
        }
    }
}
