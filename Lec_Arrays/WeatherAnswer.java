
package Lec_Arrays;

import java.util.Scanner;

public class WeatherAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int day = sc .nextInt();
        int[] a = new int[day];
        for (int i = 0;i < day;i++){
            System.out.print("Day "+ (i+1)+" ' high temp: ");
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0;i < day;i++){
            sum+=a[i];
        }
        double avg = sum/day;
        int count = 0;
        System.out.printf("Average temp = %.1f",avg);
        System.out.println("");
        for (int i = 0;i < day;i++){
            if (a[i] > avg){
                count++;
            }
        }
        System.out.println(count+ " days above average");
    }
}
