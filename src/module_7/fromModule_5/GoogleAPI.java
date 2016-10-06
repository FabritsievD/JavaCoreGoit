package module_7.fromModule_5;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoogleAPI implements API {
    private Room[] rooms= new Room[5];

    public GoogleAPI(){

        rooms[0]=new Room(45287,200,2,new Date("2016/4/15"),"Hotel1","City1");
        rooms[1]=new Room(45764,300,1,new Date("2016/5/14"),"Hotel2","City1");
        rooms[2]=new Room(47897,600,2,new Date("2016/6/13"),"Hotel3","City2");
        rooms[3]=new Room(49474,100,4,new Date("2016/7/12"),"Hotel4","City3");
        rooms[4]=new Room(12389,500,3,new Date("2016/8/11"),"Hotel5","City4");


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
