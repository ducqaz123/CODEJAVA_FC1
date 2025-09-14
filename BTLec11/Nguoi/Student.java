package BTLec11.Nguoi;

import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private long idStudent;
    private String danhGia;

    public Student(long idStudent, String name, Date birthDay, String sex, int cmnd) {
        super(name, birthDay, sex, cmnd);
        this.idStudent = idStudent;
    }

    public Student() {
    }

    public long getIdStudent() {
        return idStudent;
    }

    public String getDanhGia() {
        return danhGia;
    }
    
    public void setIdStudent(long idStudent) {
        this.idStudent = idStudent;
    }

    public void setDanhGia(String danhGia) {
        this.danhGia = danhGia;
    }
    
    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Ma sinh vien: ");
        this.setIdStudent(sc.nextLong());
        System.out.println("Danh gia ren luyen: ");
        System.out.println("1-Gioi, 2-Kha, 3-Trung binh, 4-Yeu");
        int chon = sc.nextInt();
        if (chon == 1){
            this.setDanhGia("Gioi");
        } else if (chon == 2){
            this.setDanhGia("Kha");
        } else if (chon == 3){
            this.setDanhGia("Trung Binh");
        } else if (chon == 4){
            this.setDanhGia("Yeu");
        } else {
            System.out.println("Nhap khong hop le");
        }
        System.out.println(this.getDanhGia());
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println(", Ma sinh vien: "+this.getIdStudent()+", Ren luyen: "+this.getDanhGia());
    }
}
