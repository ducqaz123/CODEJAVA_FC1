package BTLec11.Nguoi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {

    private String name;
    private Date birthDay;
    private String sex;
    private int cmnd;

    public Person(String name, Date birthDay, String sex, int cmnd) {
        this.name = name;
        this.birthDay = birthDay;
        this.sex = sex;
        this.cmnd = cmnd;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public String getSex() {
        return sex;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.println("Nhap thong tin: ");
        System.out.print("Name: ");
        this.setName(sc.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        String sn;
        boolean check = false;
        do{
        System.out.print("Ngay sinh(dd/mm/yyyy): ");
        sn = sc.nextLine();
        if (sn.charAt(2) != '/' || sn.charAt(5) != '/'){
        System.out.println("Nhap loi dinh dang dd/mm/yyy. nhap lai !!");
        check = false;
        } else {
            check = true;
        }
        } while (check != true);
        
        try {
            this.setBirthDay(sdf.parse(sn));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.print("Gioi tinh: ");
        this.setSex(sc.nextLine());
        System.out.print("CMND: ");
        this.setCmnd(sc.nextInt());
    }

    public void xuatThongTin() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        System.out.println("Ho va Ten: " + this.getName()
                + ", Ngay sinh: " + sdf.format(this.getBirthDay())
                + ", Gioi tinh: " + this.getSex()
                + ", CMND: " + this.getCmnd());
    }
}
