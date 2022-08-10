import java.util.Scanner;

public class Amount {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter weight of Bhavyas luggage ");
float b_weight = sc.nextFloat();
if (b_weight > 15) {
try {
throw new Exception("Total weight is more than 15kgs, ");
} catch (Exception e) {
System.out.println(e + "it should not exceed 15kgs");
}
float difference = b_weight-15;
float extra_amount = difference * 500;
System.out.println("extra_amount should pay" +extra_amount);
} else {
System.out.println("Please go for checkin");
}
System.out.println("Enter weight of Sruthi luggage");
float s_weight = sc.nextFloat();
if (s_weight > 15) {
try {
throw new Exception("Total weight is more than 15kgs, ");
} catch (Exception e) {
System.out.println(e + "it should not exceed 15kgs");
}
float difference = s_weight-15;
float extra_amount = difference * 500;
System.out.println("extra_amount should pay" +extra_amount);
} else {
System.out.println("Please go for checkin");
}
}
}