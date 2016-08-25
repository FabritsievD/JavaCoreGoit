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
                break;
            }
            System.out.println("NO");break;
        }
    i++;
    }



        return balances[i];
    }

    public static void main(String[] args) {
        String ownerName = "Zat";
        double withdrawal= 2000;
        System.out.println(ownerName+" "+withdrawal+" "+withdrawBalance(ownerName,withdrawal));
    }

}
