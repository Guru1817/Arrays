package ARRAY;

public class secondDarray {
    public static void main(String[] args) {
        int[][] c = {{4,8},{1,8},{7,5,2},{3,4,2,4}};
        System.out.println(c[2][1]);


        int[][] b = new int[4][3];

        for (int i = 0; i<=3; i++){
            for (int j = 0; j <=2; j++){
                System.out.print(b[i][j]);
            }
            System.out.println();
        }



        int[][] a = new int[5][];
        a[0] = new int[9];
        a[0][0] =39;
        a[1] = new int[4];
        a[1][3] = 21;
        a[2] = new int[6];
        a[3] = new int[8];
        a[4] = new int[1];
        


        for (int i=0; i<=4; i++){
            for (int j = 0; j<a[i].length; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
