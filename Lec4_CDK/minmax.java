
package Lec4_CDK;

import java.util.Scanner;

public class minmax {
    public static int findMaxNumber(int a, int b){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(findMaxNumber(a,b));
    }
}
