
package BTLec11.Nguoi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Scanner sc = new Scanner(System.in);
        int chon;
        do{
            System.out.println("Menu");
            System.out.println("0. Thoat");
            System.out.println("1. Nhap thong tin Sinh Vien / Giao vien");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Tim Sinh vien/Giao vien");
            System.out.println("4. Xoa Sinh vien/Giao vien");
            System.out.println("5. Dem Sinh vien/ Giao vien");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            if (chon == 1){
                System.out.println("Them mot nguoi vao sach");
                System.out.print("Nhap ai? 1-Sinh Vien, 2-Giao Vien :");
                int option = sc.nextInt();
                sc.nextLine();
                if (option == 1){
                    Person sv = new Student();
                    personList.themDanhSach(sv);
                    //System.out.println("Them thanh cong !!");
                }else if (option == 2){
                    Person gv = new Teacher();
                    personList.themDanhSach(gv);
                    //System.out.println("Them thanh cong !!");
                }
            } else if (chon == 2){
                personList.xuatDanhSach();
            } else if (chon == 3){
                System.out.print("Moi nhap cmnd: ");
                int cmnd = sc.nextInt();
                personList.tim(cmnd);
            } else if (chon == 4){
                System.out.print("Moi nhap cmnd: ");
                int cmnd = sc.nextInt();
                personList.xoa(cmnd);
            } else if (chon == 5){
                personList.dem();
            }
        } while(chon != 0);
    }
}
