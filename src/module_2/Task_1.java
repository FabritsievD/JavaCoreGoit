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

    static int min(int[] array) {          // пузырьковая сортировка

        boolean flag = true;
        int temp = 0;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    flag = true;
                }
            }
        }

        return array[0];

    }

    static double min(double[] array) {           //шейкерная сортировка

        boolean flag = true;
        double temp = 0;

        while (flag) {
            flag = false;
            for(int i=0; i<array.length-1; i++){
                if(array[i] > array[i+1]){
                    temp = array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;

                }
            }

            for (int j = array.length-1; j >0; j--) {
                if (array[j] < array[j-1]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    flag = true;
                }
            }
        }

        return array[0];
    }

    static int max(int [] array){                  // четно-нечетная сортировка

        boolean flag=true;
        int temp=0;

        while(flag){
            flag=false;
            for(int i=0; i<array.length-1;i+=2){
                if(array[i]>array[i+1]){
                    temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }
            for(int j=1;j<array.length-2;j+=2){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                    flag=true;
                }
            }
        }
        return array[array.length-1];
    }

    static double max(double [] array){         // сортировка расческой

        boolean flag = true;
        final double COEF=1.247; //коэффициент уменьшения
        int step = (int)(array.length/COEF); // первоначальный шаг расчески
        double temp;



        while(flag){

            flag = false;

            for(int i=0;i<array.length-1;i++){
                if(i+step>array.length-1) break; // что б не залез за макс. индекс массива

                if(array[i]>array[i+step]){

                    temp = array[i];
                    array[i] = array[i+step];
                    array[i+step] = temp;
                    flag = true;
                }

            }
            if(step!=1) {                   // что бы коэф не стал "ноль"
                step = (int) (step / COEF);// уменьшаем шаг расчески
            } else step=1;


        }
        return array[array.length-1];
    }

    static int maxPositive(int [] array){

            if(Task_1.max( array)<0)
                System.out.print("There is no positive numbers. The biggest is ");
            else System.out.print("Max positive number is ");

            return Task_1.max(array);

    }

    static double maxPositive(double [] array){

        if(Task_1.max( array)<0)
            System.out.print("There is no positive numbers. The biggest is ");
        else System.out.print("Max positive number is ");

        return Task_1.max(array);
    }

    static int multiplication(int [] array){
        int res=1;

        for(int i=0; i<array.length; i++){

            if( array[i]!=0)
                res*=array[i];

        }
        return res;

    }

    static double multiplication(double [] array){
        double res=1;

        for(int i=0; i<array.length; i++){

            if(array[i]!=0)
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
    int [] mas1={9,20,20,20,20,20};
    double[] mas = {32.1, -3.5, 4.2, 6.6, 0.56, 2.5, 7.234, 10, 5, 14.2};

    System.out.println(Task_1.secondLargest(mas));

}


}



