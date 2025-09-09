package BaiTapLec9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean check = true;
        while (check) {
            System.out.print("Ban muon nhap thong tin cho ai ? 1 - sinh vien, 2 - giao vien: ");
            int chon = sc.nextInt();
            sc.nextLine();
            if (chon == 1) {
                Student st = new Student();
                st.input(sc);
                st.output();
                System.out.print("Tiep tuc ? 1 - yes, 0 - no");
                int x = sc.nextInt();
                if (x == 0) {
                    check = false;
                }
            } else if (chon == 2) {
                Teacher tc = new Teacher();
                tc.input(sc);
                tc.output();
                System.out.print("Tiep tuc ? 1 - yes, 0 - no: ");
                int x = sc.nextInt();
                if (x == 0) {
                    check = false;
                }
            }
        }
    }
}
