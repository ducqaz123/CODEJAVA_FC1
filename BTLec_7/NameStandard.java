
package BTLec_7;

import java.util.Scanner;

public class NameStandard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = " ";
        String[] arr = s.split("\\s+");
        for (String x : arr){
            ans += Character.toUpperCase(x.charAt(0));
            for (int i = 1;i < x.length();i++){
                ans += Character.toLowerCase(x.charAt(i));
            }
            ans += " ";
        }
        System.out.print(ans.trim());
    }
}
