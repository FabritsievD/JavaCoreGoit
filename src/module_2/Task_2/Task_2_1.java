package module_2.Task_2;


public class Task_2_1{

    static double  withdrawBalance(double balance, double withdrawal){
       final double COMMISSION = 0.05;




        if(((COMMISSION*withdrawal)+withdrawal)< balance){
            balance= balance-((COMMISSION*withdrawal)+withdrawal);

            System.out.println("OK "+(COMMISSION*withdrawal)+" "+balance);

                    }
        else System.out.println("NO");


        return  0;
    }

    public static void main(String[] args) {
        withdrawBalance(100,50);
    }
}
