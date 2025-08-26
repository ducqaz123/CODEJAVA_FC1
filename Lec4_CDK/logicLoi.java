
package Lec4_CDK;
import java.util.Scanner;
public class logicLoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What percentage did you earn? ");
        int n = sc.nextInt();
        if (n <=100 && n >= 90){
            System.out.println("You got an A !");
        } else if (n >= 80){
            System.out.println("You got an B !");
        } else if (n >= 70){
            System.out.println("You got an C !");
        } else if (n >= 60){
            System.out.println("You got an D !");
        } else if (n < 60){
            System.out.println("You got an F !");
        }
    }
}
