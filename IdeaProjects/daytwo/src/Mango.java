import java.util.*;
public class Mango {
    public static void main(String args[])
    {
        HashMap<String,Integer> data=new HashMap();
        data.put("type1",50);
        data.put("type2",100);
        data.put("type3",150);
        int sum=0;
        for(Map.Entry<String,Integer> iterator : data.entrySet()) {

            System.out.println("RateCard:" + iterator.getKey() + "," + iterator.getValue());

        }


    }
}
