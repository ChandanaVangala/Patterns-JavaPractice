package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        /*
            *****
            ****
            ***
            **
            * 
        */
        int n=5;//you can change n value
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
