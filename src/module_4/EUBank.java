package module_4;


public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if(getCurrency().equals(Currency.USD)) limit=2000;
        else limit=2200;

        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limit;
        if(getCurrency().equals(Currency.USD)) limit=10000;
       else limit=20000;
        return limit;
    }

    @Override
    int getMonthlyRate() {
        int rate;
        if(getCurrency().equals(Currency.USD)) rate=0;
        else rate=1;
        return rate;
    }

    @Override
    int getComission(int summ) {
        int comission;
        if(getCurrency().equals(Currency.USD)){
            if(summ<=1000) comission=5;
            else comission=7;
            return comission;
        }

         if(summ<=1000) comission=2;
        else comission=4;

        return comission;
    }
}
