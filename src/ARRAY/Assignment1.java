package ARRAY;

public class Assignment1 {
    public static void main(String[] args) {
        int [][]a = {{12,23,45,57,78},{54,57,34,46},{32,15,76,54}};
        for (int[] ele:a){
            for (int b:ele){
                System.out.print(b + " ");
            }
            System.out.println();

        }
    }
}
