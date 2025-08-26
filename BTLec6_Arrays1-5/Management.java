package BTLec6_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Management {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        boolean check = true;
            System.out.println("Menu:");
            System.out.println("1. Add a new task");
            System.out.println("2. View all tasks.");
            System.out.println("3. Remove a task by its position (index).");
            System.out.println("4. Exit");
            System.out.print("Chon: ");
            while(check) {
                int chon = sc.nextInt();
                if (chon == 1) {
                    System.out.print("Add a new task: ");
                    sc.nextLine();
                    String s = sc.nextLine();
                    arr.add(s);
                    System.out.println("Succesful !!");
                } else if (chon == 2) {
                    System.out.println("View ");
                    for (int i = 0; i < arr.size(); i++) {
                        System.out.println(arr.get(i));
                    }
                } else if (chon == 3) {
                    System.out.print("Enter your index: ");
                    int index = sc.nextInt();
                    arr.remove(index);
                    System.out.println("Remove succesful");
                } else if (chon == 4) {
                    System.out.println("See You Again !!");
                    check = false;
                }
            }
        }
    }

