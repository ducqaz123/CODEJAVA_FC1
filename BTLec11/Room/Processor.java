package BTLec11.Room;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoomList roomList = new RoomList();
        int chon;
        do {
            System.out.println("Menu");
            System.out.println("0. Exit");
            System.out.println("1. Add 1 Meeting room / Bed room");
            System.out.println("2. Update a room by ID");
            System.out.println("3. Delete a room by ID");
            System.out.println("4. Find a room by ID");
            System.out.println("5. Display All rooms");
            System.out.println("6. Find the most expensive room");
            System.out.println("7. Count the total number of Meeting Rooms and Bedrooms");
            System.out.print("Option: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch(chon){
                case 1:
                    int option;
                    System.out.println("1.Meeting room");
                    System.out.println("2.Bed room");
                    System.out.print("Option: ");
                    option = sc.nextInt();
                    sc.nextLine();
                    if (option == 1){
                        System.out.print("ID: ");
                        String id = sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Base Cost: ");
                        double baseCost = sc.nextDouble();
                        System.out.print("Capacity: ");
                        int capacity = sc.nextInt();
                        Room mt = new MeetingRoom(capacity,id,name,baseCost);
                        roomList.addRoom(mt);
                    } else if (option == 2){
                        System.out.print("ID: ");
                        String id = sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Base Cost: ");
                        double baseCost = sc.nextDouble();
                        System.out.print("Number Of Bed: ");
                        int numberOfBed = sc.nextInt();
                        Room br = new BedRoom(numberOfBed,id,name,baseCost);
                        roomList.addRoom(br);
                    }
                    break;
                case 2:
                    System.out.print("ID room update: ");
                    String newID = sc.nextLine();
                    System.out.print("Name new room: ");
                    String newName = sc.nextLine();
                    System.out.print("New Base Cost: ");
                    double newBaseCost = sc.nextDouble();
                    roomList.updateRoomById(newID, newName, newBaseCost);
                    break;
                case 3:
                    System.out.print("ID room delete: ");
                    String deleteID = sc.nextLine();
                    roomList.deleteRoomById(deleteID);
                    break;
                case 4:
                    System.out.print("ID room find: ");
                    String findID = sc.nextLine();
                    roomList.findRoomById(findID);
                    break;
                case 5:
                    System.out.println("LIST ROOM");
                    roomList.displayAllRoom();
                    break;
                case 6:
                    Room tmp = roomList.findMostExpensiveRoom();
                    System.out.println("Most Expensive Room is: ");
                    tmp.displayDetail();
                    break;
                case 7:
                    roomList.countRoom();
                    break;
            }
        } while (chon != 0);
    }
}
