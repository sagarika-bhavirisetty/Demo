public class Exception2 {
    public static void main(String[] args)
    {
        String  str=null;
        try{
            if(str.equals("str1"))
                System.out.println("Same");
            else
                System.out.println(" not Same");


        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
    }
}
