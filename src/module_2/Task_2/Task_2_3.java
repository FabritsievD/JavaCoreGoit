package module_2.Task_2;


public class Task_2_3 {

    static double [] balances={1000,2500,400,340,5000};
    static String [] ownerNames={"Vincent","Butch","Marselos","Mia", "Zat"};

    static double fundBalance(String ownerName, double fund) {
    int i;
    for( i=0; i<balances.length;i++){
        if(ownerNames[i]==ownerName){
            balances[i]+= fund;
            break;
        }
            }
        return balances[i];
    }

    public static void main(String[] args) {
        String ownerName = "Zat";
        double fund = 6700;

        System.out.print(ownerName+" "+fundBalance(ownerName,fund));
    }
}
