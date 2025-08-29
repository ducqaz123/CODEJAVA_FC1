package BTLec_7;
import java.util.Scanner;
public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] a = new int[256];
        for (char c : s.toCharArray()){
            a[c]++;
        }
        StringBuilder sd = new StringBuilder("");
        for (int i = 0;i < 256;i++){           
            if (a[i] != 0){
                sd.append((char)i).append(a[i]);
                a[i] = 0;
            }
        }
        System.out.println(sd.toString());
    }
}
