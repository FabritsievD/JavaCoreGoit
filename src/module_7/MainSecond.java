package module_7;


import java.util.Iterator;
import java.util.TreeSet;

import static module_7.Currency.UAH;
import static module_7.Currency.USD;

public class MainSecond {

    public static void main(String[] args) {

        User user1 = new User(12367,"John","Howard","Kiev",4000);
        User user2 = new User(56467,"Ron","Richmond","Kharkov",12565);
        User user3 = new User(18907,"Jim","Won","Lviv",4000);
        User user4 = new User(34537,"Tom","Rom","Yalta",800);
        User user5 = new User(45787,"Dick","Petrov","Kiev",2400);
        User user6 = new User(65789,"Red","Gurov","Lviv",10000);
        User user7 = new User(45787,"Dok","Lomos","Lutsk",2400);
        User user8 = new User(65789,"Rod","Gur","Kiev",10000);
        User user9 = new User(45787,"Duck","Pilkon","Poltava",2400);
        User user10 = new User(65789,"Reed","Gram","Lviv",10000);


        Order[] orders = new Order[10];
        orders[0] = new Order(231425, 18000, USD, "VW", "AutoRio", user1);
        orders[1] = new Order(854712, 800, USD, "Toy Car BMW", "eBay", user2);
        orders[2] = new Order(452385, 2300, UAH, "War&Piece", "Aukro", user3);
        orders[3] = new Order(390578, 500, USD, "Washing_M", "OLX", user4);
        orders[4] = new Order(254790, 500, USD, "iPhone6", "Allo", user5);
        orders[5] = new Order(755800, 200, UAH, "Vodka", "Tavria_V", user6);
        orders[6] = new Order(900058, 1900, USD, "TV", "Foxtrot", user7);
        orders[7] = new Order(845749, 2300, UAH, "Player", "Eldorado", user8);
        orders[8] = new Order(900058, 1900, USD, "TV", "Foxtrot", user7);
        orders[9] = new Order(845749, 2300, UAH, "Player", "Eldorado", user8);

       TreeSet<Order> orderTreeSet = new TreeSet<>();

        for (Order o : orders) {
            orderTreeSet.add(o);
        }

        Iterator <Order> iterator = orderTreeSet.iterator();                      //check if set contain Order where User’s lastName is - “Petrov”

        while (iterator.hasNext()) {
            if (iterator.next().getUser().getLastName().equals("Petrov")) {
                System.out.println(iterator.next());
            }
        }


        Iterator<Order> iterator1 = orderTreeSet.iterator();                        //delete orders where currency is USD using Iterator
        while (iterator1.hasNext()){
            if(iterator1.next().getCurrency().equals(Currency.USD)){
                iterator1.remove();
            }
        }
        System.out.println(orderTreeSet);

    }









}
