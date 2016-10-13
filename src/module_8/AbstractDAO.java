package module_8;


import java.util.List;

public  interface AbstractDAO<T> {

    T save(T smth);
    void delete(T smth);
    void deleteById(long id);
    void deleteAll(List <T> list);
    void saveAll(List <T> list);
    T get(long id);
    List<T> getList (List<Long> id );


}
