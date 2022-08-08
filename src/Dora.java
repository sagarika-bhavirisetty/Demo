import java.util.*;
import java.io.*;
 public class Dora
{
public static void main (String[] args) 
{
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int c=sc.nextInt();
int k=sc.nextInt();
if((k>=1&&k<=c)||k%c==0||k%c==1)
System.out.println("yes");
else
System.out.println("no");
}
}
