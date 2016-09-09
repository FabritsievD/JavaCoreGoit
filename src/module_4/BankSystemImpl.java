package module_4;

public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {

        Bank userBank = user.getBank();

        double commission =(double) userBank.getComission(amount)/100;

            if(userBank.getLimitOfWithdrawal() >= amount+commission) {
                double newBallance = user.getBalance() - amount - amount*commission;
                user.setBalance(newBallance);
            }



    }

    @Override
    public void fundUser(User user, int amount) {

        Bank userBank=user.getBank();
        double newBallance=user.getBalance();
        if (userBank.getLimitOfFunding()==1){
            newBallance=user.getBalance()+amount;
        }
        else
            if(userBank.getLimitOfFunding()>amount)
                newBallance=user.getBalance()+amount;

        user.setBalance(newBallance);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

        Bank fromUserBank=fromUser.getBank();
        Bank toUserBank=toUser.getBank();

        double fromUserNewBallance;
        double toUserNewBallance;

        if(fromUserBank.getCurrency().equals(toUserBank.getCurrency())) {
            fromUserNewBallance = fromUser.getBalance() - amount;
            toUserNewBallance=toUser.getBalance()+amount;
        }
        else
            if(fromUserBank.getCurrency().equals(Currency.USD)){
                fromUserNewBallance = fromUser.getBalance()-amount;
                toUserNewBallance=toUser.getBalance()+amount*0.9;
            }
            else{
                fromUserNewBallance=fromUser.getBalance()-amount;
                toUserNewBallance=toUser.getBalance()+amount*1.1;
            }

    fromUser.setBalance(fromUserNewBallance);
    toUser.setBalance(toUserNewBallance);
    }

    @Override
    public void paySalary(User user) {

        double newBallance;

        newBallance=user.getBalance()+user.getSalary();

        user.setBalance(newBallance);
    }
}
