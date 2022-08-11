
class InvalidAgeException extends Exception
{
    public InvalidAgeException (String str)
    {
        super(str);
    }
}
public class CustomException
{
    static void validate (int age) throws InvalidAgeException{
        if(age < 18){
            System.out.println("age is not valid to vote");
        }
        else {
            System.out.println("valid to vote");
        }
    }


    public static void main(String args[])
    {



        try
        {
            validate(28);
        }
        catch (InvalidAgeException ex)
        {
            System.out.println("Caught the exception");

        }
        System.out.println("rest of the code...");
    }
}