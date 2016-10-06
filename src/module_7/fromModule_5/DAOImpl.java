package module_7.fromModule_5;

import java.util.ArrayList;
import java.util.List;

public class DAOImpl implements DAO {

    private List<Room> roomsDB = new ArrayList<>();

    public List<Room> getRoomsDB() {
        return roomsDB;
    }

    public void setRoomsDB(List<Room> roomsDB) {
        this.roomsDB = roomsDB;
    }

    @Override
    public Room save(Room room) {

        roomsDB.add(room);
        setRoomsDB(roomsDB);
        return null;
    }

    @Override
    public boolean delete(Room room) {

        for(Room o : roomsDB){
            if(o.equals(room)){
                roomsDB.remove(o);
                setRoomsDB(roomsDB);
                return true;

            }
        }
        return false;
    }

    @Override
    public Room update(Room room) {

        for(int i=0;i<roomsDB.size();i++){
            if(roomsDB.get(i).getId()==room.getId()){
                roomsDB.set(i, room);
            }
        }
        setRoomsDB(roomsDB);
    return null;
    }


    @Override
    public Room findById(long id) {

        for(Room o : roomsDB){
            if(o.getId()==id){
                return o;
            }
        }

        return null;
    }

    @Override
    public List<Room> getAll() {
        return getRoomsDB();
    }
}
