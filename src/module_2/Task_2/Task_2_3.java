package module_2.Task_2;


public class Task_2_3 {

    static double [] balances={1000,2500,400,340,5000};
    static String [] ownerNames={"Vincent","Butch","Marselos","Mia", "Zat"};
    static int i;
    static double res;
    static double fundBalance(String ownerName, double fund) {



    for( i=0; i<balances.length;i++){

        if(ownerNames[i]==ownerName){
           res= balances[i]+ fund;
            return res;
        }

            }
        return -1;
    }

    public static void main(String[] args) {
        String ownerName = "Butch";
        double fund = 700;

            if(fundBalance(ownerName,fund)!=(-1)) {
                System.out.print(ownerName + " " + fundBalance(ownerName, fund));
                balances[i] = res;
            }
        else System.out.print(ownerName+" NO");
    }
}
