import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int n=sc.nextInt();
        a=(x-n);
        b=(y-n);
        c=(z-n);
        if(a<0&&b<0&&c<0)
            System.out.println("None ");
        else if(a<b&&a<c)
            System.out.println("L1 ");
        else if(b<a&&b<c)
            System.out.println("L2 ");
        else
            System.out.println("L3 ");

        }
}
