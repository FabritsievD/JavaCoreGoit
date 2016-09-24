package module_5;

public class DAOImpl implements DAO{

    private Room[] roomsDB = new Room[10];

    public Room[] getRoomsDB() {
        return roomsDB;
    }

    public void setRoomsDB(Room[] roomsDB) {
        this.roomsDB = roomsDB;
    }

    @Override
    public Room save(Room room) {

        for(int i=0;i<roomsDB.length;i++){
            if(roomsDB[i]==null){ roomsDB[i]=room;

            return null;}
        }

        for(int i=0;i<roomsDB.length;i++){
            if(i>=0&&i<roomsDB.length-1) {roomsDB[i]=roomsDB[i+1];}
            roomsDB[i]=room;
        }
        setRoomsDB(roomsDB);
        return null;
    }

    @Override
    public boolean delete(Room room) {
        Room[] res= new Room[10];
        for(int i=0;i<roomsDB.length;i++) {
            if (roomsDB[i] != null && roomsDB[i].equals(room)) {
                System.arraycopy(roomsDB, 0, res, 0, i);
                System.arraycopy(roomsDB, i + 1, res, i, roomsDB.length - i - 1);
                setRoomsDB(res);

                return true;
            }
        }

        return false;
    }

    @Override
    public Room update(Room room) {
        for(int i=0;i<roomsDB.length;i++){
            if(roomsDB[i].getId()==room.getId()){
                roomsDB[i]=room; break;
            }
        }
        setRoomsDB(roomsDB);
    return null;
    }


    @Override
    public Room findById(long id) {

        for(int i=0;i<roomsDB.length;i++){
            if(roomsDB[i].getId()==id){
                return roomsDB[i];
            }
        }

        return null;
    }

    @Override
    public Room[] getAll() {
        return getRoomsDB();
    }
}
