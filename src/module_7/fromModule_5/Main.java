package module_7.fromModule_5;

import java.util.List;

public class Main {


    static List<Room> request1;
    static List<Room> request2;
    static List<Room> request3;

    public static void request(List<Room> request) {
        for (int i = 0; i < request.size(); i++) {
            System.out.println(request.get(i).toString());
        }
    }

    public static void chek(List<Room> chek){
        for(int i=0;i<chek.size();i++){
            System.out.println(chek.get(i).toString());
        }
    }

    public static void main(String[] args) {

        Controller controller = new Controller();

         request1= controller.requstRooms(200,2,"City1","Hotel1");
         request2=controller.requstRooms(700,2,"City1","Hotel3");
         request3=controller.requstRooms(500,1,"City3","Hotel2");

       System.out.println("Request1");
        request(request1);
        System.out.println("Request2");
        request(request2);
        System.out.println("Request3");
        request(request3);



        API googleCom= new GoogleAPI();
        API bookingCom = new BookingComAPI();
        API tripAdvisor = new TripAdvisorAPI();

        List<Room> chek1=controller.check(bookingCom,tripAdvisor);
        List<Room> chek2=controller.check(bookingCom,googleCom);
        List<Room> chek3=controller.check(tripAdvisor,googleCom);

        System.out.println("Chek1");
        chek(chek1);
        System.out.println("Chek2");
        chek(chek2);
        System.out.println("Chek3");
        chek(chek3);

       DAOImpl a=new DAOImpl();

       a.save(request1.get(0));
        a.save(request1.get(1));
       a.save(request2.get(0));


       a.delete(request1.get(0));
        System.out.println();
        System.out.println(a.findById(45287));
        System.out.println();
        int l=a.getRoomsDB().size();
        for (int i=0;i<l;i++){
         System.out.println(a.getRoomsDB());
         }
    }

}
