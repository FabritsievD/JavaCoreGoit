package module_4;

import static module_4.Currency.EUR;
import static module_4.Currency.USD;

public class Main {




    public static void main(String[] args) {

        Bank usBank=new USBank(345446,"USD",USD,500,2000,10,700000);
        Bank euBank=new EUBank(67834,"EU",EUR,200,1500,15,600000);
        Bank chinaBank=new ChinaBank(91568,"China",USD,300,700,20,500000);

        User user1 = new User(12367,"John",4000,20,"ford",3000, usBank);
        User user2 = new User(56467,"Ron",12565,13,"apple",3400,usBank);
        User user3 = new User(18907,"Jim",4680,10,"volvo",2500, euBank);
        User user4 = new User(34537,"Tom",800,26,"vw",3800, euBank);
        User user5 = new User(45787,"Dick",100,7,"sdkgj",500, chinaBank);
        User user6 = new User(65789,"Rod",6000,1,"skjgio",600, chinaBank);

        /* что б не писать 24 функции создал класс Functions, в котором функция functions принимает
        два юзера (второй для перевода), сумму снятия, сумму пополнения и сумму перевода. И результаты каждой
                операции выводит в консоль.
        P.s Наверное можно было сделать красивее... но не знаю как...
        */

        Functions userFunctions = new Functions();

        userFunctions.functions(user1,user3,900,500,1000);
        userFunctions.functions(user2,user4,1000,200,2000);
        userFunctions.functions(user3,user5,700,600,1000);
        userFunctions.functions(user4,user6,1100,500,1000);
        userFunctions.functions(user5,user2,50,500,1000);
        userFunctions.functions(user6,user3,900,500,1000);

      /* BankSystem bankSystem = new BankSystemImpl();

        bankSystem.withdrawOfUser(user1,900);
        System.out.println(user1.toString());
        bankSystem.fundUser(user1,600);
        System.out.println(user1.toString());
        bankSystem.paySalary(user1);
        System.out.println(user1);
        bankSystem.transferMoney(user1,user3,700);
        System.out.println(user1.toString());
        */
    }
}
