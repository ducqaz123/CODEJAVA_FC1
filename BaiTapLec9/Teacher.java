package BaiTapLec9;

import java.util.Scanner;

public class Teacher extends People {

    int chon;

    @Override
    public void input(Scanner sc) {
        System.out.println("Nhap thong tin: ");
        System.out.print("Ho va ten: ");
        super.name = sc.nextLine();
        System.out.print("Ngay sinh(dd//mm/yyyy): ");
        super.date = sc.nextLine();
        System.out.print("Gioi tinh: ");
        super.sex = sc.nextLine();
        System.out.print("CMND: ");
        super.CMND = sc.nextLong();
        System.out.print("Ma giao vien: ");
        super.ID = sc.nextLong();
        System.out.println("Chon xep loai thi dua: ");
        System.out.println("1-Loai A, 2-Loai B, 3-Loai C, 4-Loai D");
        chon = sc.nextInt();
        if (chon == 1) {
            System.out.println("Thi dua loai A");
        } else if (chon == 2) {
            System.out.println("Thi dua loai B");
        } else if (chon == 3) {
            System.out.println("Thi dua loai C");
        } else if (chon == 4) {
            System.out.println("Thi dua loai D");
        } else {
            System.out.println("Nhap khong dung yeu cau !!");
        }
    }

    @Override
    public void output() {
        System.out.println("HovaTen: " + this.name
                + ", " + "Ngaysinh: " + this.date
                + ", " + "Gioi tinh: " + this.sex
                + ", " + "CMND: " + this.CMND
                + ", " + "Ma giao vien: " + this.ID);
    }

}
