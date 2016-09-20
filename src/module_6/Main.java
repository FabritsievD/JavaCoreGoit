package module_6;


public class Main {










    public static void main(String[] args) {

        User[] users = new User[9];
        users[0]= new User(12367,"John","Howard",1000,4000);
        users[1]= new User(56467,"Ron","Richmond",2000,12565);
        users[2]= new User(18907,"Jim","Won",1300,4000);
        users[3]= new User(34537,"Tom","Rom",900,800);
        users[4]= new User(45787,"Dick","Vomkon",1200,2400);
        users[5]= new User(65789,"Rod","Gur",3000,10000);
        users[6]= new User(45787,"Dick","Vomkon",1200,2400);
        users[7]= new User(65789,"Rod","Gur",3000,10000);
        users[8]= null;

      // User[] res=UserUtils.uniqueUsers(users);
       // User[] res=UserUtils.usersWithContitionalBalance(users,5000);
        //User[] res=UserUtils.paySalaryToUsers(users);
        /*long[] res=UserUtils.getUsersId(users);
        for (int i=0;i<res.length;i++){
          System.out.println(res[i]);
        }
     */

        User[] res =UserUtils.deleteEmptyUsers(users);

        for (int i=0;i<res.length;i++){
            System.out.println(users[i].toString());
        }

    }
}
