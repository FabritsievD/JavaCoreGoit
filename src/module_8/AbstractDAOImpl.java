package module_8;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractDAOImpl implements AbstractDAO<User> {

    static  DbEmulator<User> db = new DbEmulator<>(new ArrayList<>());

    @Override
    public User save(User user) {
        db.getList().add(user);
        return user;
    }

    @Override
    public void delete(User user) {
        db.getList().remove(user);

    }

    @Override
    public void deleteById(long id) {

        Iterator<User> iter=db.getList().iterator();
        while(iter.hasNext()){
            if(iter.next().getId()==id){
                iter.remove();
            }
        }

    }

    @Override
    public void deleteAll(List<User> list) {
        db.getList().removeAll(list);


    }

    @Override
    public void saveAll(List<User> list) {
    db.getList().addAll(list);
    }

    @Override
    public User get(long id) {
        Iterator<User> iter = db.getList().iterator();
        while (iter.hasNext()) {
            User tmp = iter.next();
            if(tmp.getId()==id){
                return tmp;
            }
        }

        return null;
    }

    @Override
    public List<User> getList(List<Long> id) {

        List<User> users = new ArrayList<>();

        Iterator<User> iterDB = db.getList().iterator();

        while (iterDB.hasNext()) {
        User tmp = iterDB.next();
        Iterator<Long> iterL = id.iterator();

            while (iterL.hasNext()){
                Long tmp1=iterL.next();
                if(tmp1==tmp.getId()){
                    users.add(tmp);
                }
            }
        }

        return users;
    }
}
