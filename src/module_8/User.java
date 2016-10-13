package module_8;


import java.util.List;

public class User extends AbstractDAOImpl {
    private long id;
    private String mame;

    public User(long id, String mame) {
        this.id = id;
        this.mame = mame;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMame() {
        return mame;
    }

    public void setMame(String mame) {
        this.mame = mame;
    }

    AbstractDAOImpl dao = new AbstractDAOImpl();

    public User save(User user){
        dao.save(user);
        return user;
    }

    public void delete(User user){
        dao.delete(user);
    }

    public void deleteById(long id){
        dao.deleteById(id);
    }

    public void deleteAll(List<User> list){
        dao.deleteAll(list);
    }

    public  void saveAll(List<User> list){
        dao.saveAll(list);
    }

    public User get(long id){
        return dao.get(id);
}

    public List<User> getList(List<Long> id){
        return dao.getList(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", mame='" + mame + '\'' +
                ", dao=" + dao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        return mame != null ? mame.equals(user.mame) : user.mame == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (mame != null ? mame.hashCode() : 0);
        return result;
    }
}
