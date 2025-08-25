
package BTLec6_Arrays;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Number to find X = ");
        int x = sc.nextInt();
        int cnt = 0;
        for (int i = 0;i < n;i++){
            if (a[i] == x){
                cnt++;
            }
        }
        System.out.println("The number "+x+" appears "+cnt+" times");
    }
}
