package module_5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        Room[] request= controller.requstRooms(200,2,"City1","Hotel1");

        System.out.println(Arrays.toString(request));

        API bookingCom= new BookingComAPI();
        API tripAdvisor=new TripAdvisorAPI();

        Room[] chek=controller.check(bookingCom,tripAdvisor);

        System.out.println(Arrays.toString(chek));
    }

}
