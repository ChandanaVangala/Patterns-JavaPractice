package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        /*
            *
            **
            ***
            ****
            *****
            ****
            ***
            **
            * 
        */
        int n=9;//can change n value
        for(int i=0;i<=n/2;i++)//n/2==
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=(n/2)-1;i>=0;i--)
        {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
