public class Exception1 {
    public static void main(String[] args)
    {
        try{
            int arr[]={1,2};
            System.out.println(arr[3]);

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
