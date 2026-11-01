public class Ten10 {
    public static void main(String[] args) {
        String a = "=======Value of I=======";
        System.out.println(a); 

        // Using For Loop
        for (int i=10; i>1; i--) {
            System.out.println("I = " + i);
        }

        System.out.println("=======Value of J=======");

        // Using While Loop
        int j = 0;
        while (j < 11) {
            System.out.println("J = " + j);
            ++j;
        }
    }
}
