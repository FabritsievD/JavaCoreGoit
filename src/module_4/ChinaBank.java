package module_4;


public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if(getCurrency().equals(Currency.USD)) limit=100;
        else limit=150;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limit;
        if(getCurrency().equals(Currency.USD)) limit=10000;
        else limit = 5000;
        return limit;
    }

    @Override
    int getMonthlyRate() {
        int rate;
        if(getCurrency().equals(Currency.USD)) rate=1;
        else rate=0;
        return rate;
    }

    @Override
    int getComission(int summ) {
        int comission;
        if(getCurrency().equals(Currency.USD)){
            if(summ<=1000) comission=3;
            else comission=5;
            return comission;
        }
        if(summ<=1000) comission=10;
        else comission=11;
        return comission;
    }
}
