package module_7.fromModule_5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripAdvisorAPI implements API {

  private   Room[] rooms= new Room[5];

    public TripAdvisorAPI() {

        rooms[0]=new Room(567788,100,4,new Date("2016/9/15"),"Hotel5","City1");
        rooms[1]=new Room(572327,200,2,new Date("2016/7/13"),"Hotel3","City1");
        rooms[2]=new Room(12589,500,2,new Date("2016/9/23"),"Hotel2","City2");
        rooms[3]=new Room(78533,600,4,new Date("2016/10/30"),"Hotel1","City3");
        rooms[4]=new Room(45963,800,5,new Date("2016/8/16"),"Hotel4","City4");
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
