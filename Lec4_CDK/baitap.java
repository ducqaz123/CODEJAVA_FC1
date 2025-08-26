
package Lec4_CDK;

import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble();
        if (x > 0 && y > 0){
            System.out.println(1);
        } else if (x < 0 && y > 0){
            System.out.println(2);
        } else if (x < 0 && y < 0){
            System.out.println(3);
        } else if (x > 0 && y < 0){
            System.out.println(4);
        } else {
            System.out.println(0);
        }
        
    }
}

