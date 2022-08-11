import java.util.*;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.toUpperCase;
import static java.lang.Character.toLowerCase;

public class Capital {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        String string1=" ";
        for(int i=0;i<str.length();i++)
        {
            if(isLowerCase(str.charAt(i)))
            {
                string1=string1 +toUpperCase(str.charAt(i));
            }
            else {
                string1=string1+toLowerCase(str.charAt(i));
            }
        }
        System.out.println(string1);
    }
}
