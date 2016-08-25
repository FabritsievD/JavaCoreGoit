package module_2;


public  class Task_1 {

    static int sum(int[] array) {
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }
        return res;
    }

    static double sum(double[] array) {
        double res = 0;
        for (double i : array) {
            res += i;
        }
        return res;
    }

    static int min(int[] array) {

        int min = array[0];

        for (int i = 0; i < array.length - 1; i++) {

                if (min > array[i + 1]) {
                    min = array[i+1];
                }
            }
        return min;

    }

    static double min(double[] array) {

        double min = array[0];

        for (int i = 0; i < array.length - 1; i++) {

            if (min > array[i + 1]) {
                min = array[i + 1];
            }
        }
        return min;
    }

    static int max(int [] array){

        int max = array[0];

        for (int i = 0; i < array.length - 1; i++) {

            if (max < array[i + 1]) {
                max = array[i+1];
            }
        }
        return max;
    }

    static double max(double [] array){         // сортировка расческой

        double max = array[0];

        for (int i = 0; i < array.length - 1; i++) {

            if (max < array[i + 1]) {
                max = array[i+1];
            }
        }
        return max;
    }

    static int maxPositive(int [] array){

        int maxPositive=max(array);
            if(maxPositive<0)
                System.out.print("There is no positive numbers. The biggest is ");
            else System.out.print("Max positive number is ");

            return maxPositive;

    }

    static double maxPositive(double [] array){

        double maxPositive=max(array);

        if(maxPositive<0)
            System.out.print("There is no positive numbers. The biggest is ");
        else System.out.print("Max positive number is ");

        return maxPositive;
    }

    static int multiplication(int [] array){
        int res=1;

        for(int i=0; i<array.length; i++){


                res*=array[i];

        }
        return res;

    }

    static double multiplication(double [] array){
        double res=1;

        for(int i=0; i<array.length; i++){


                res*=array[i];
        }

        return res;

    }

    static int modulus(int [] array){

        int res=0;

        for(int i=array.length-1; i>0;i--){
            if(array[i]!=0){
             res= array[0]%array[i]; break;}

        }
    return res;
    }

    static double  modulus(double [] array){

        double res=0;

        for(int i=array.length-1;i>0;i--){
            if (array[i]!=0){
                res=array[0]%array[i]; break;
            }
        }
    res*=1000;
    int tmp=(int)(res);
        res=(double)tmp/1000;
return res;
   }

   static int secondLargest(int [] array){

       boolean flag=true;
       int secondLagest=0;
       int temp;
       while(flag){
           flag=false;

           for(int i=0;i<array.length-1;i++){
               if(array[i]>array[i+1]){
                   temp=array[i];
                   array[i]=array[i+1];
                   array[i+1]=temp;
                   flag=true;
               }

           }
       }
       for(int j=array.length-1;j>0;j--){              //проверка на одинаковые по величине эл-ты
           if(array[j]>array[j-1]) {
               secondLagest = array[j - 1];
               break;
           }
           if (j==1){                                    // если все эл=ты одинаковые
               secondLagest=array[array.length-1];
           }
       }
       return secondLagest;
   }

    static double secondLargest(double [] array){
        boolean flag=true;
        double secondLagest=0;
        double temp;
        while(flag){
            flag=false;

            for(int i=0;i<array.length-1;i++){
                if(array[i]>array[i+1]){
                    temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    flag=true;
                }

            }
        }
        for(int j=array.length-1;j>0;j--){              //проверка на одинаковые по величине эл-ты
            if(array[j]>array[j-1]) {
                secondLagest = array[j - 1];
                break;
            }
            if (j==1){                                    // если все эл=ты одинаковые
                secondLagest=array[array.length-1];
            }
        }
        return secondLagest;

    }

public static void main(String[] args) {
    int [] arrayForInt={9,20,70,20,20,1};
    double[] arrayForDouble = {32.1, -3.5, 4.2, 6.6, 678.56, 2.5, 7.234, 10, 5, 14.2};

    System.out.println(secondLargest(arrayForInt));

}


}



