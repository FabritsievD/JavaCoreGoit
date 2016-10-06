package module_7;


import java.util.Comparator;

public class ItemIdentificatorCityComparator implements Comparator <Order> {

    @Override
    public int compare(Order o1, Order o2) {

        int result = o1.getItemName().compareTo(o2.getItemName());
        if(result!=0){
            return result;
        }

        result = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
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
