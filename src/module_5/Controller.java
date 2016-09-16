package module_5;


public class Controller  {

    API apis[] = new API[3];





    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new TripAdvisorAPI();
        apis[2]= new GoogleAPI();

    }



    Room[] requstRooms(int price, int persons, String city, String hotel){

        Room [] requestsFromBC = apis[0].findRooms(price,persons,city,hotel);
        Room [] requestsFromTA = apis[1].findRooms(price,persons,city,hotel);
        Room [] requestsFromG = apis[2].findRooms(price,persons,city,hotel);

        int lengthBC = requestsFromBC.length;
        int lengthTA = requestsFromTA.length;
        int lengthG = requestsFromG.length;

        Room [] totalRequest = new Room[lengthG + lengthTA + lengthBC];

        System.arraycopy(requestsFromBC, 0, totalRequest, 0, lengthBC);
        System.arraycopy(requestsFromTA,0, totalRequest, lengthBC, lengthTA);
        System.arraycopy(requestsFromG, 0, totalRequest, lengthTA+lengthTA, lengthG);


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


    }

