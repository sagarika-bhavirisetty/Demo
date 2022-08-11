import java.util.*;
class MarkSheet{
    public static void main(String args[]){
        int sum1 =0;
        int sum2 =0;
        int percentage1,percentage2;
        ArrayList<Integer> MarksList=new ArrayList<Integer>();
        MarksList.add(92);
        MarksList.add(83);
        MarksList.add(88);
        MarksList.add(99);
        MarksList.add(74);
        MarksList.add(96);
        MarksList.get(5);

        for (int i =0;i<MarksList.size();i++)
        {
            sum1 = sum1 + MarksList.get(i);
        }

        percentage1 = (sum1*100)/600;
        System.out.println("Total Marks is "+sum1);
        System.out.println("Percentage is "+percentage1);

//Removing element on the Position of 2 and recalculating the Total and Percentage
        try {
            MarksList.remove(2);
        }
        catch(Exception e){
            System.out.println("exception occurs");

        }

        for (int i =0;i<MarksList.size();i++)
        {
            sum2 = sum2 + MarksList.get(i);
        }

        percentage2 = (sum2*100)/500;
        System.out.println("Total Marks after removing element 2 is "+sum2);
        System.out.println("Percentage after removing element 2 is "+percentage2);

    }
}