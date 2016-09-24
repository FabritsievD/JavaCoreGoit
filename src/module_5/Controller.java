package module_5;


public class Controller  {

    API apis[] = new API[3];
    DAO funcDAO = new DAOImpl();

    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new TripAdvisorAPI();
        apis[2]= new GoogleAPI();

    }



    Room[] requstRooms(int price, int persons, String city, String hotel){

        Room [] requestsFromBC = apis[0].findRooms(price,persons,city,hotel);
        Room [] requestsFromTA = apis[1].findRooms(price,persons,city,hotel);
        Room [] requestsFromG = apis[2].findRooms(price,persons,city,hotel);

        int lengthBC=0;
        int lengthTA=0;
        int lengthG=0;

        if(requestsFromBC!=null) { lengthBC = requestsFromBC.length;}
        if(requestsFromTA!=null) { lengthTA = requestsFromTA.length;}
        if(requestsFromG!=null)  { lengthG = requestsFromG.length;}

        Room [] totalRequest = new Room[lengthG + lengthTA + lengthBC];
                int index=0;
        if(requestsFromBC!=null) {
            for (int i=0; i<requestsFromBC.length;i++){
                totalRequest[index]=requestsFromBC[i];
                index++;
            }

        }
        if(requestsFromTA!=null) {
            for (int i=0;i<requestsFromTA.length;i++){
                totalRequest[index]=requestsFromTA[i];
                index++;
            }
        }
        if(requestsFromG!=null)  {
            for(int i=0;i<requestsFromG.length;i++){
                totalRequest[index]=requestsFromG[i];
                index++;
            }
        }


        return totalRequest;
    }

    Room[] check(API api1, API api2){

        int roomsCounter=0;

        Room [] roomsFromApi1 = api1.getAllRooms();
        Room [] roomsFromApi2 = api2.getAllRooms();

        for(int i=0; i<roomsFromApi1.length;i++){

            Room tempApi1 = roomsFromApi1[i];

            for (int j=0; j<roomsFromApi2.length;j++){

                Room tempApi2=roomsFromApi2[j];

                if(tempApi1.equals(tempApi2)){


                    roomsCounter++;
                }

            }
        }
        Room [] theSameRooms = new Room[roomsCounter];
        int index=0;

        for(int i=0; i<roomsFromApi1.length;i++){

            Room tempApi1 = roomsFromApi1[i];

            for (int j=0; j<roomsFromApi2.length;j++){

                Room tempApi2=roomsFromApi2[j];

                if(tempApi1.equals(tempApi2)){

                    theSameRooms[index]=tempApi1;
                index++;

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


    public Room[] getAll() {
       return funcDAO.getAll();

    }

    }

