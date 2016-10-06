package module_7.fromModule_5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingComAPI implements API {

  private   Room [] rooms = new Room[5];

    public BookingComAPI() {

        rooms[0] = new Room(85236, 700, 2, new Date("2016/10/16"), "Hotel4", "City1");
        rooms[1] = new Room(95423, 300, 6, new Date("2016/9/16"), "Hotel5", "City2");
        rooms[2] = new Room(74125, 500, 2, new Date("2016/8/16"), "Hotel3", "City2");
        rooms[3] = new Room(96325, 300, 2, new Date("2016/7/16"), "Hotel2", "City3");
        rooms[4] = new Room(85241, 900, 1, new Date("2016/6/16"), "Hotel1", "City3");
    }



    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        Room neededRoom = new Room(price,persons,city);
        List<Room> tmp = new ArrayList<>();

        for (int i=0;i<rooms.length;i++){

            if(rooms[i].equals(neededRoom)){
                tmp.add(rooms[i]);
            }
        }

            Room[] res = new Room[tmp.size()];
            tmp.toArray(res);

        return res;
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }
}
