package module_7.fromModule_5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller  {

    API apis[] = new API[3];
    DAO funcDAO = new DAOImpl();

    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new TripAdvisorAPI();
        apis[2]= new GoogleAPI();

    }



    List<Room> requstRooms(int price, int persons, String city, String hotel){

        List <Room> requestsFromBC = new ArrayList<>(Arrays.asList(apis[0].findRooms(price,persons,city,hotel)));
        List <Room> requestsFromTA = new ArrayList<>(Arrays.asList(apis[1].findRooms(price,persons,city,hotel)));
        List <Room> requestsFromG = new ArrayList<>(Arrays.asList(apis[2].findRooms(price,persons,city,hotel)));

        List<Room> totalRequest = new ArrayList<>();

        if(requestsFromBC!=null) {

            totalRequest.addAll(requestsFromBC);
        }
        if(requestsFromTA!=null) {

            totalRequest.addAll(requestsFromTA);
        }
        if(requestsFromG!=null)  {

            totalRequest.addAll(requestsFromG);
        }



          return totalRequest;
    }

    List<Room> check(API api1, API api2){

        List<Room> roomsFromApi1 = new ArrayList<>(Arrays.asList(api1.getAllRooms()));
        List<Room> roomsFromApi2 = new ArrayList<>(Arrays.asList(api2.getAllRooms()));

        List<Room> theSameRooms = new ArrayList<>();

        for(Room o : roomsFromApi1){
            for(Room k : roomsFromApi2){
                if(o.equals(k)){
                    theSameRooms.add(o);
                }
            }
        }

        return theSameRooms;
    }

    public Room save(Room room) {
        funcDAO.save(room);
        return  null;
    }


    public boolean delete(Room room) {
        funcDAO.delete(room);
        return true;
        }





    public Room update(Room room) {
        funcDAO.update(room);
        return null;
    }



    public Room findById(long id) {

        funcDAO.findById(id);
        return null;
    }


    public List<Room> getAll() {
       return funcDAO.getAll();

    }

    }

