import java.util.Scanner;

public class Pattern{
    public static void main(String []args)
    {

        Scanner sc= new Scanner(System.in);
        
        int a = sc.nextInt();
        
        int b = sc.nextInt();
        int i,j;

        int n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            
            for( j=0;j<=i;j++) 
            System.out.print(a);
            for( int k=j;k<n+1;k++)
            System.out.print(b);
            System.out.println();
        }


    }
    }