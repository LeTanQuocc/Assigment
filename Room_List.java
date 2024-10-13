package assignment12;

import java.util.ArrayList;

public class Room_List {

    private ArrayList<Room> roomList;

    public Room_List(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }

    public Room_List() {
        this.roomList = new ArrayList<>();
    }

    public void addRoom(Room room) {
        roomList.add(room);

    }

    public void DeleteRoom(String Maphong) {
        for (int i = 0; i <= roomList.size(); i++) {
            if (roomList.get(i).getMaphong().equals(Maphong)) {
                roomList.remove(i);
            }
        }
    }

    public void UpdateRoom(String Maphong, Room rm) {
        for (int i = 0; i <= roomList.size(); i++) {
                 if (roomList.get(i).getMaphong().equals(Maphong)) {
                roomList.set(i, rm);
                System.out.println("da cap nhat");
                return;
            }
        }
        System.out.println("khong tim thay");
    }
}