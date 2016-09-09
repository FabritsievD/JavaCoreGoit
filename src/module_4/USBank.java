package module_4;


public class USBank extends Bank {


    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency().equals(Currency.USD)) limit = 1000;
        else limit = 1200;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limit = 1;
        if (getCurrency().equals(Currency.EUR)) limit = 1000;
        return limit;
    }

    @Override
    int getMonthlyRate() {
        int rate;
        if (getCurrency().equals(Currency.USD))
            rate = 1;
        else rate = 2;
        return rate;
    }

    @Override
    int getComission(int summ) {
        int comission;
        if (getCurrency() == Currency.USD) {

            if (summ <= 1000)
                comission = 5;
            else comission = 7;
            return comission;
        }


            if (summ <= 1000)
                comission = 2;
           else   comission = 4;
       return comission;
    }
}