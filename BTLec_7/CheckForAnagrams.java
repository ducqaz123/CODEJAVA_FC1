
package BTLec_7;

import java.util.Arrays;
import java.util.Scanner;

public class CheckForAnagrams {
    public static boolean checkForAnagram(String s1, String s2){
        int l1 = s1.length();
        int l2 = s2.length();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1,arr2) && l1 == l2)
            return true;
        else 
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (checkForAnagram(s1,s2) == true){
            System.out.println("The two strings are Anagrams");
        } else {
            System.out.println("The two strings are not Anagrams");
        }
    }
}
