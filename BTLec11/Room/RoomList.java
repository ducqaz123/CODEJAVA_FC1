package BTLec11.Room;

import java.util.ArrayList;

public class RoomList {

    private ArrayList<Room> r;

    public RoomList(ArrayList<Room> r) {
        this.r = r;
    }

    public RoomList() {
        r = new ArrayList<>();
    }

    public ArrayList<Room> getR() {
        return r;
    }

    public void setR(ArrayList<Room> r) {
        this.r = r;
    }

    public void addRoom(Room room) {
        r.add(room);
        System.out.println("Them thanh cong !!");
    }

    public void updateRoomById(String id, String name, double baseCost) {
        boolean check = false;
        for (Room x : r) {
            if (x.getId().equals(id)) {
                x.setName(name);
                x.setBaseCost(baseCost);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Khong tim thay phong !!");
        } else {
            System.out.println("Cap nhat thanh cong !!");
        }
    }

    public void deleteRoomById(String id) {
        boolean check = false;
        for (int i = 0; i < r.size(); i++) {
            if (r.get(i).getId().equals(id)) {
                r.remove(r.get(i));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Khong tim thay ID phong !!");
        } else {
            System.out.println("Xoa thanh cong !!");
        }
    }

    public void findRoomById(String id) {
        boolean check = false;
        for (Room x : r) {
            if (x.getId().equals(id)) {
                System.out.println("Tim thanh cong !!");
                x.displayDetail();
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Khong tim thay phong !!");
        }
    }

    void displayAllRoom() {
        if (r.size() <= 0) {
            System.out.println("Danh sach trong !!");
        } else {
            for (Room x : r) {
                x.displayDetail();
            }
        }

    }

    public Room findMostExpensiveRoom() {
        Room tmp = r.get(0);
        for (Room x : r) {
            if (tmp.calculateCost() < x.calculateCost()) {
                tmp = x;
            }
        }
        return tmp;
    }

    public void countRoom() {
        int countMeetRoom = 0, countBedRoom = 0;
        for (Room x : r) {
            if (x instanceof MeetingRoom) {
                countMeetRoom++;
            } else {
                countBedRoom++;
            }
        }
        System.out.println("Meeting Room: " + countMeetRoom);
        System.out.println("Bed Room: " + countBedRoom);
    }
}
