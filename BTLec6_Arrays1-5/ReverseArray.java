
package BTLec6_Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
//        int l = 0, r = n - 1;
//        while (l <= r){
//            int tmp = l;
//            a[l] = a[r];
//            a[r] = tmp;
//            l++;
//            r--;
//        }
        for (int i = n - 1;i >= 0;i--){
            System.out.print(a[i]+" ");
        }
    }
}
