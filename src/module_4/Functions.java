package module_4;


public class Functions extends BankSystemImpl {

    BankSystem bankSystem = new BankSystemImpl();

    public void functions(User user, User toUser, int withdrawal, int fund, int transfer){

        bankSystem.withdrawOfUser(user,withdrawal);
        System.out.println(user.toString());

        bankSystem.fundUser(user,fund);
        System.out.println(user.toString());

        bankSystem.paySalary(user);
        System.out.println(user);

        bankSystem.transferMoney(user,toUser,transfer);
        System.out.println(user.toString());
        System.out.println();
    }
}
