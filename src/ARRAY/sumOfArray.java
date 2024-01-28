package ARRAY;

class test{
    int arr[] = {1,2,3,4,5};
    int sum(){
        int sum = 0;
        for (int i = 0; i<=arr.length; i++){
            sum += i;
        }
        return sum;

    }
}

public class sumOfArray {
    public static void main(String[] args) {
        test obj = new test();
        int result = obj.sum();
        System.out.println(result);
    }
}
