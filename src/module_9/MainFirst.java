package module_9;


import java.util.*;

import static module_9.Currency.UAH;
import static module_9.Currency.USD;

public class MainFirst {


    public static void main(String[] args) {
        User user1 = new User(12367, "John", "Howard", "Kiev", 4000);
        User user2 = new User(56467, "Ron", "Richmond", "Kharkov", 12565);
        User user3 = new User(18907, "Jim", "Won", "Lviv", 4000);
        User user4 = new User(34537, "Tom", "Rom", "Yalta", 800);
        User user5 = new User(45787, "Dick", "Vomkon", "Kiev", 2400);
        User user6 = new User(65789, "Red", "Gurov", "Lviv", 10000);
        User user7 = new User(45787, "Dok", "Lomos", "Lutsk", 2400);
        User user8 = new User(65789, "Rod", "Gur", "Kiev", 10000);
        User user9 = new User(45787, "Duck", "Pilkon", "Poltava", 2400);
        User user10 = new User(65789, "Reed", "Gram", "Lviv", 10000);

        Order[] orders = new Order[14];
        orders[0] = new Order(231425, 18000, USD, "VW", "AutoRio", user1);
        orders[1] = new Order(854712, 800, USD, "Toy Car BMW", "eBay", user2);
        orders[2] = new Order(452385, 2300, UAH, "War&Piece", "Aukro", user3);
        orders[3] = new Order(390578, 500, USD, "Washing_M", "OLX", user4);
        orders[4] = new Order(254790, 500, USD, "iPhone6", "Allo", user5);
        orders[5] = new Order(755800, 200, UAH, "Vodka", "Tavria_V", user6);
        orders[6] = new Order(900058, 1900, USD, "TV", "Foxtrot", user7);
        orders[7] = new Order(845749, 2300, UAH, "Player", "Eldorado", user8);
        orders[8] = new Order(940023, 1060, UAH, "T-shit", "Madoc", user9);
        orders[9] = new Order(123456, 700, UAH, "Dog", "DogFans", user10);
        orders[10] = new Order(940023, 1060, UAH, "T-shit", "Colins", user9);
        orders[11] = new Order(123456, 700, UAH, "Dog", "DogFans", user4);
        orders[12] = new Order(940023, 1060, UAH, "T-shit", "Colins", user9);
        orders[13] = new Order(123456, 700, UAH, "Dog", "DogFans", user4);

        List<Order> ordersList = new ArrayList<>();
        for (int i = 0; i < orders.length; i++) {
            ordersList.add(orders[i]);
        }

        // Collections.sort(ordersList, (o1,o2)->o2.getPrice()-o1.getPrice());                      //sort list by Order price in decrease order
        // System.out.println(ordersList);


      /*   Collections.sort(ordersList, (o1,o2)->{                                                  //sort list by Order price in increase order AND User city
             int result = o2.getPrice()-o1.getPrice();
             if(result!=0){
                 return result;
             }

             result=o1.getUser().getCity().compareTo(o2.getUser().getCity());
             if(result!=0){
                 return result;
             }
             return 0;
         });
        System.out.println(ordersList);
        */


       /*   Collections.sort(ordersList, (o1,o2)->{                                                     //sort list by Order itemName AND ShopIdentificator AND User city

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
          });

          for (int i = 0; i <ordersList.size() ; i++) {
              System.out.println(ordersList.get(i));

          }  */


         Set<Order> orderSet = new HashSet<>(ordersList);          //delete duplicates from the list

       // orderSet.stream()
         //       .forEach(System.out::println);








         List<Order> orderList = new ArrayList<>(orderSet);        //delete items where price less than 1500







       Iterator<Order> iterator = orderList.iterator();

        while(iterator.hasNext()) {
            int priceUAH;
            Order tmp = iterator.next();
            if (tmp.getCurrency().equals(Currency.USD)) {
                priceUAH = tmp.getPrice() * 25;
            } else {
                priceUAH = tmp.getPrice();
            }
            if (priceUAH < 1500) {
                iterator.remove();
            }
        }
        for (int i = 0; i <orderList.size() ; i++) {
                 System.out.println(orderList.get(i));

              }



       /* List<Order> orderUAH = new ArrayList<>();              //separate list for two list - orders in USD and UAH
        List<Order> orderUSD = new ArrayList<>();
        Iterator<Order> iterator1=orderList.iterator();

        while (iterator1.hasNext()){
            Order tmp = iterator1.next();
            if(tmp.getCurrency().equals(Currency.USD)){
                orderUSD.add(tmp);
            }
            else {
                orderUAH.add(tmp);
            }
        }

        System.out.println(orderUAH);
        System.out.println(orderUSD);
         */

   /* Map <String,List> orderMap = new HashMap<>();                   //separate list for as many lists as many unique cities are in User


        int i = 0;
        for (Order o : ordersList) {

            if (!orderMap.containsKey(ordersList.get(i).getUser().getCity())){

                orderMap.put(ordersList.get(i).getUser().getCity(),new ArrayList());

            }
            i++;
        }

        for (Order o:ordersList){
            String city = o.getUser().getCity();
            Set<String> keys = orderMap.keySet();

            for(String currentKey : keys){
            if(currentKey.equals(city)){
               List<Order> currentList = orderMap.get(city);

                currentList.add(o);
                orderMap.put(city,currentList);

            }

            }

        }

        for (Map.Entry entry : orderMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());

        } */
    }

}

