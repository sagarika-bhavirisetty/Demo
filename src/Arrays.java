ackage p;

import java.util.Arrays;


public class Main {

public static void main(String[] args) {

int[] a = new int[10];

int max = 0,min=a[0];

for (int i = 0; i < a.length-1; i++) {
if (a[i] > max) {
max = a[i];

}
}
System.out.println(max);
for (int i = 0; i < a.length-1; i++) {
if (a[i] < min) {
min = a[i];

}
}
System.out.println(min);

}
}