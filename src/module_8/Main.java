package module_8;


import java.util.ArrayList;
import java.util.List;

import static module_8.AbstractDAOImpl.db;

public class Main {


    public static void main(String[] args) {

        db.getList().add(new User(123456,"Peter"));
        db.getList().add(new User(897456,"Shon"));
        db.getList().add(new User(852369,"Ron"));
        db.getList().add(new User(159753,"Stive"));
        db.getList().add(new User(358256,"Rick"));
        db.getList().add(new User(298436,"John"));
        db.getList().add(new User(201036,"Den"));
        db.getList().add(new User(756321,"Coby"));
        db.getList().add(new User(103080,"Elvis"));
        db.getList().add(new User(853789,"Richard"));

        User user = new User(842365,"Howard");

        user.save(user);

        user.delete(user);

        user.deleteById(123456);

        List<User> list = new ArrayList<>();
        list.add(new User(897456,"Shon"));
        list.add(new User(852369,"Ron"));

        user.deleteAll(list);

        user.saveAll(list);

        System.out.println(user.get(159753));
        System.out.println();

        List<Long> list1 = new ArrayList<>();
        list1.add(298436L);
        list1.add(201036L);
        list1.add(756321L);

        System.out.println(user.getList(list1));
        System.out.println();

       for(User o : db.getList()) {
           System.out.println(o);
       }

    }
}
