package module_9;


import java.util.Comparator;

public class PriceCityComparator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {

        int result = o2.getPrice()-o1.getPrice();
        if(result!=0){
            return result;
        }

        result=o1.getUser().getCity().compareTo(o2.getUser().getCity());
        if(result!=0){
            return result;
        }
        return 0;
    }
}
