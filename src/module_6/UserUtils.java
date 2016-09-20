package module_6;

public class UserUtils {

   public static User[] uniqueUsers(User[] users) {

      if(users.length==1)return users;

      int counter = 0;

      for (int i = 0; i < users.length-1; i++) {

              for(int index=i+1; index < users.length; index++) {
                  if(users[i]==null&&users[index]==null) continue;
                  if (users[i].equals(users[index])) {
                      users[index]=null;
                      counter++;
                  }
              }
          }
User[] res = new User[users.length-counter];
      int j=0;
            for(int i=0; i<users.length;i++){

                    if(users[i]!=null){
                        res[j]=users[i];
                        j++;
                    }
            }
          return res;
  }

    public static User[] usersWithContitionalBalance(User[] users, int balance){
       int count = 0;

       for (int i=0; i<users.length;i++){
           if(users[i].getBalance()==balance) count++;
       }

       User[] res = new User[count];
       int index=0;
       for (int i=0;i<users.length;i++){
           if(users[i].getBalance()==balance){
               res[index]=users[i];
               index++;
           }
       }

        return res;
    }

    public static User[] paySalaryToUsers(User[] users){

         for (int i=0;i<users.length;i++){

             users[i].setBalance(users[i].getBalance()+users[i].getSalary());
         }

        return users;
    }

    public static long[] getUsersId(User[] users){

        long[] res = new long[users.length];

        for(int i=0;i<users.length;i++){
            res[i]=users[i].getId();
        }

        return res;
    }

    public static User[] deleteEmptyUsers(User[] users){
        int counter=0;

        for (int i=0; i<users.length;i++){
            if(users[i]==null) counter++;
        }

        User[] res = new User[users.length-counter];
        int index=0;

        for (int i=0;i<users.length;i++){
            if(users[i]!=null){
                res[index]=users[i];
                index++;
            }
        }

        return res;


    }
}
