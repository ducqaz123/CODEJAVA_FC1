
package BTLec6_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0;i < n;i++){
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0){
                arr.add(a[i]);
            }
        }
        for (int i = 0;i < arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
