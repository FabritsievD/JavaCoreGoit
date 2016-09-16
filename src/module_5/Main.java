package module_5;

public class Main {

    public static void request(Room[] request) {
        for (int i = 0; i < request.length; i++) {
            System.out.println(request[i].toString());
        }
    }

    public static void chek(Room[] chek){
        for(int i=0;i<chek.length;i++){
            System.out.println(chek[i].toString());
        }
    }

    public static void main(String[] args) {

        Controller controller = new Controller();

        Room[] request1= controller.requstRooms(200,2,"City1","Hotel1");
        Room[] request2=controller.requstRooms(700,2,"City1","Hotel3");
        Room[] request3=controller.requstRooms(500,1,"City3","Hotel2");

        System.out.println("Request1");
        request(request1);
        System.out.println("Request2");
        request(request2);
        System.out.println("Request3");
        request(request3);



        API googleCom= new GoogleAPI();
        API bookingCom = new BookingComAPI();
        API tripAdvisor = new TripAdvisorAPI();

        Room[] chek1=controller.check(bookingCom,tripAdvisor);
        Room[] chek2=controller.check(bookingCom,googleCom);
        Room[] chek3=controller.check(tripAdvisor,googleCom);

        System.out.println("Chek1");
        chek(chek1);
        System.out.println("Chek2");
        chek(chek2);
        System.out.println("Chek3");
        chek(chek3);

    }

}
