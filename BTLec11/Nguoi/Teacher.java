
package BTLec11.Nguoi;

import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {
    private long idTeacher;
    private String thiDua;

    public Teacher(String name, Date birthDay, String sex, int cmnd) {
        super(name, birthDay, sex, cmnd);
    }

    public Teacher() {
    }

    public long getIdTeacher() {
        return idTeacher;
    }

    public String getThiDua() {
        return thiDua;
    }
    
    public void setIdTeacher(long idTeacher) {
        this.idTeacher = idTeacher;
    }

    public void setThiDua(String thiDua) {
        this.thiDua = thiDua;
    }
    
    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); 
        System.out.println(", Ma giao vien: "+this.getIdTeacher()+", Xep loai thi dua: "+this.getThiDua());
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc); 
        System.out.print("Ma giao vien: ");
        this.setIdTeacher(sc.nextLong());
        System.out.println("Chon xep loai thi dua: ");
        System.out.println("1-Loai A, 2-Loai B, 3-Loai C, 4-Loai D");
        int chon = sc.nextInt();
        if (chon == 1){
            this.setThiDua("Loai A");
        } else if (chon == 2){
            this.setThiDua("Loai B");
        } else if (chon == 3){
            this.setThiDua("Loai C");
        } else if (chon == 4){
            this.setThiDua("Loai D");
        } else {
            System.out.println("Nhap khong dung !!");
        }
        System.out.println(this.getThiDua());
    }
    
    
}
