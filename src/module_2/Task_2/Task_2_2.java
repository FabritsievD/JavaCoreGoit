package module_2.Task_2;


public class Task_2_2 {

static double [] balances={1000,2500,400,340,5000};
static String [] ownerNames={"Vincent","Butch","Marselos","Mia", "Zat"};

    static double withdrawBalance(String ownerName, double withdrawal) {

        final double COMMISSION=0.05;
        int i=0;

    for(String name:ownerNames){
        if(name==ownerName){
            if(balances[i]>=(withdrawal+(withdrawal*COMMISSION))){
                balances[i]=balances[i]-(withdrawal+(withdrawal*COMMISSION));

                return balances[i];
            }
        }
    i++;
    }
        return -1;
    }

    public static void main(String[] args) {
        String ownerName = "Zat";
        double withdrawal= 20000;

        if(withdrawBalance(ownerName, withdrawal)==(-1))
        System.out.print(ownerName+" NO ");
        else System.out.print(ownerName+" "+withdrawal+" "+withdrawBalance(ownerName,withdrawal));
    }

}
