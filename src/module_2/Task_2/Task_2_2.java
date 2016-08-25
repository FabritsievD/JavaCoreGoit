package module_2.Task_2;


public class Task_2_2 {

static double [] balances={1000,2500,400,340,5000};
static String [] ownerNames={"Vincent","Butch","Marselos","Mia", "Zat"};
static int i;
static double res;

    static double withdrawBalance(String ownerName, double withdrawal) {

        final double COMMISSION=0.05;


    for( i=0;i<ownerNames.length;i++){

        if(ownerNames[i]==ownerName){
            if(balances[i]>=(withdrawal+(withdrawal*COMMISSION))){
                res=balances[i]-withdrawal-(withdrawal*COMMISSION);

                return res;
            }

        }

    }
        return -1;
    }

    public static void main(String[] args) {
        String ownerName = "Zati";
        double withdrawal= 5000;

        if(withdrawBalance(ownerName, withdrawal)==(-1))
        System.out.print(ownerName+" NO ");
        else {
            System.out.print(ownerName+" "+withdrawal+" "+withdrawBalance(ownerName,withdrawal));
            balances[i]=res;
        }
    }
}
