
package Lec4_CDK;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 42 , y = 17, z = 25;
        if ((y < x) && (y <= z)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (((x % 2) == (y % 2)) || ((x % 2) == (z % 2))){
            System.out.println("True");
        } else {
            System.out.println("False");
        } 
        if ((x <= y + z) && (x >= y + z)){
            System.out.println("True");
        } else {
            System.out.println("False");
        } 
        if (!(x < y && x < z)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
//        if (((x + y) % 2 == 0) || !((z - y) % 2 == 0)){
//            System.out.println("True");
//        } else {
//             System.out.println("False");
//        }
        System.out.println(((x + y) % 2 == 0) || !((z - y) % 2 == 0));
    }
}
