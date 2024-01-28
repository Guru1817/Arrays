package ARRAY;

public class DuplicateElement {
    public static void main(String[] args) {
        int array[] ={1,2,4,4,5,3,6};
        int n = array.length;

        for (int i = 0; i<n;i++){
            for (int j =i+1;j<n;j++){
                if (array[i] == array[j]){
                    System.out.println(array[i]);
                }
            }
        }
    }
}
