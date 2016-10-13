package module_8;

import java.util.ArrayList;


public class DbEmulator<T> {

    private ArrayList<T> list;

    public ArrayList<T> getList() {
        return list;
    }

    public void setList(ArrayList<T> list) {
        this.list = list;
    }

    public DbEmulator(ArrayList<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "DbEmulator{" +
                "list=" + list +
                '}';
    }
}
