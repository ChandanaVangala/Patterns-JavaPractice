package Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        /*
            *
            **
            ***
            ****
            ***** 
        */
        int n=5;//you can change n value
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}
