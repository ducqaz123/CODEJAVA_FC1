package BaiTapLec9;

import java.util.Scanner;

public abstract class People {

    String name;
    String date;
    String sex;
    long CMND;
    long ID;

    public People(String name, String date, String sex, long CMND, long ID) {
        this.name = name;
        this.date = date;
        this.sex = sex;
        this.CMND = CMND;
        this.ID = ID;
    }

    public People() {
    }

    public abstract void input(Scanner sc);

    public abstract void output();
}
