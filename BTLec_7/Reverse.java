
package BTLec_7;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        int l = 0;
        int r = arr.length - 1;
         while(l < r){
             String tmp = arr[l];
             arr[l] = arr[r];
             arr[r] = tmp;
             l++;
             r--;
         }
        
        StringBuilder sd = new StringBuilder("");
        for (String x : arr){
            sd.append(x).append(" ");
        }
            System.out.print(sd.toString().trim());
    }
}
