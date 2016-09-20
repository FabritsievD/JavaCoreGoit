package module_6;

public final class ArraysUtils {

    public static int sum(int[] array) {
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }
        return res;
    }

    public static int min(int[] array) {

        int min = array[0];

        for (int i = 0; i < array.length - 1; i++) {

            if (min > array[i + 1]) {
                min = array[i + 1];
            }
        }
        return min;

    }

    public static int max(int[] array) {

        int max = array[0];

        for (int i = 0; i < array.length - 1; i++) {

            if (max < array[i + 1]) {
                max = array[i + 1];
            }
        }
        return max;
    }

    public static int maxPositive(int[] array) {

        int maxPositive = max(array);
        if (maxPositive < 0)
            System.out.print("There is no positive numbers. The biggest is ");
        else System.out.print("Max positive number is ");

        return maxPositive;

    }

    public static int multiplication(int[] array) {
        int res = 1;

        for (int i = 0; i < array.length; i++) {


            res *= array[i];

        }
        return res;

    }

    public static int modulus(int[] array) {

        int res = 0;

        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] != 0) {
                res = array[0] % array[i];
                break;
            }

        }
        return res;
    }

    public static int secondLargest(int[] array) {

        boolean flag = true;
        int secondLagest = 0;
        int temp;
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
        for (int j = array.length - 1; j > 0; j--) {              //проверка на одинаковые по величине эл-ты
            if (array[j] > array[j - 1]) {
                secondLagest = array[j - 1];
                break;
            }
            if (j == 1) {                                    // если все эл=ты одинаковые
                secondLagest = array[array.length - 1];
            }
        }
        return secondLagest;
    }

    public static int[] reverse(int[] array){

        for(int i=0;i<(array.length/2);i++){
            int tmp;
            tmp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=tmp;

        }
        return array;
    }

    public static int[] findEven(int[] array){

        int counter=0;
        for(int i=0;i<array.length;i++){
            if (array[i]%2==0) counter++;
        }
        int[] res = new int[counter];
        counter=0;
        for (int i=0;i<array.length;i++){
            if(array[i]%2==0){
             res[counter]=array[i];
                counter++;
            }
        }
        return res;
    }

    public static void main(String[] args) {

      int[] array= {11,222,323,432,5456,657,7868,846,922};

      findEven(array);

        for(int i=0;i<findEven(array).length;i++) {
            System.out.println(findEven(array)[i]);
        }
    }
}