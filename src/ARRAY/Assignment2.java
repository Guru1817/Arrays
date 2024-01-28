package ARRAY;

public class Assignment2 {
    public static void main(String[] args) {
        String [][][]a = {{{"sanu","kunu","juju",},{"munu","ranu","gunu"},{"rohit","rasmi","rakul"}},
                            {{"kamu","samu","alia"},{"rahul","sahu","chinu"}}};

        for (String[][] ele:a){
            for (String[] b:ele){
                for (String c:b){
                    System.out.print(c + " ");
                }
                System.out.println();
            }
            System.out.println();

        }
    }
}
