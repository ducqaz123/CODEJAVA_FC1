
package BTLec6_Arrays;

import java.util.Scanner;

public class MinMaxInArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        int min = 0, max = 0;
        for (int i = 0;i < n;i++){
            min = Math.min(a[i], min);
            max = Math.max(a[i], max);
        }
        System.out.println("The maximum value is: "+max+", The minimum value is: "+min);
    }
}
