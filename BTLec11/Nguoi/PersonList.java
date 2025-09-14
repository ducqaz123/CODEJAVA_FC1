package BTLec11.Nguoi;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {

    ArrayList<Person> arr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void themDanhSach(Person n) {
        n.nhapThongTin(sc);
        arr.add(n);
        System.out.println("Them thanh cong !!");
        sc.nextLine();
    }

    public void xuatDanhSach() {
        if (arr.size() == 0) {
            System.out.println("Danh Sach Trong");
        } else {
            for (Person x : arr) {
                x.xuatThongTin();
            }
        }
    }

    public void tim(int cmnd) {
        boolean check = false;
        for (Person x : arr) {
            if (x.getCmnd() == cmnd) {
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (check) {
            System.out.println("Tim thay thanh cong");
        } else {
            System.out.println("Khong tim thay !!");
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getCmnd() == cmnd) {
                //System.out.println("Tim thanh cong");
                arr.get(i).xuatThongTin();
            }
        }
    }

    public void xoa(int cmnd) {
        for (Person x : arr) {
            if (x.getCmnd() == cmnd) {
                for (int i = 0; i < arr.size(); i++) {
                    if (arr.get(i).getCmnd() == cmnd) {
                        arr.remove(arr.get(i));
                    }
                }
                System.out.println("Xoa thanh cong");
                break;
            } else {
                System.out.println("Khong tim thay !!");
            }
        }
        
    }

    public void dem() {
        int demGV = 0, demSV = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Student) {
                demSV++;
            } else {
                demGV++;
            }
        }
        System.out.println("Co " + demSV + " Sinh Vien va " + demGV + " Giao vien");
    }             

}
