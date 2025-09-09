package BaiTapLec9;

import java.util.Scanner;

public class Student extends People {

    int chon;

    @Override
    public void input(Scanner sc) {
        //Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin: ");
        System.out.print("Ho va ten: ");
        super.name = sc.nextLine();
        System.out.print("Ngay sinh(dd//mm/yyyy): ");
        super.date = sc.nextLine();
        System.out.print("Gioi tinh: ");
        super.sex = sc.nextLine();
        System.out.print("CMND: ");
        super.CMND = sc.nextLong();
        System.out.print("Ma sinh vien: ");
        super.ID = sc.nextLong();
        System.out.println("Danh gia ren luyen: ");
        System.out.println("Chon 1-gioi, 2-kha, 3-trung binh, 4-yeu");
        chon = sc.nextInt();
        if (chon == 1) {
            System.out.println("Xep loai gioi");
        } else if (chon == 2) {
            System.out.println("Xep loai kha");
        } else if (chon == 3) {
            System.out.println("Xep loai trung binh");
        } else if (chon == 4) {
            System.out.println("Xep loai yeu");
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
                + ", " + "Ma sinh vien: " + this.ID);
    }

}
