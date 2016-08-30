package module_3.Task4;


public class User {
    private String name;
    private int balance;
    private int monthOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthOfEmployment = monthOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthOfEployment() {
        return monthOfEmployment;
    }

    public void setMonthOfEployment(int monthOfEployment) {
        this.monthOfEmployment = monthOfEployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    void  paySalary(){
    setBalance(balance+salary);
    }

    void withdraw(int summ){
        int res;

        if(summ < 1000) {
            res = (int)(balance - summ - (summ * 0.05));
        }
            else res=(int)(balance-summ-(summ*0.1));

        setBalance(res);

    }

    int companyNameLenght(String companyName){

        return (companyName.length());
    }


    void monthIncreaser(int addMonth){
        setMonthOfEployment(monthOfEmployment+addMonth);
    }

    public static void main(String[] args) {
        
    }
}
