package module_5;

public class DAOImpl implements DAO{
    @Override
    public Room save(Room room) {
        System.out.println("Room was saved "+ room);
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Room was deleded "+ room);
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Room was updated "+ room);
        return null;
    }

    @Override
    public Room findById(long id) {
        System.out.println("Room was found by id "+ id);
        return null;
    }
}
