package offline.task_1;


public class task_1 {

    static int rand(int a,int b) {
        boolean flag = true;
        int tmp = (int) (Math.random() * 100);
        while (flag) {

            if(tmp>=a&&tmp<=b){
                flag=false;
            }
            else break;
        }
        return tmp;
    }

    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            int a=(int)(Math.random()*100);
            int b=(int)(Math.random()*100);
            array[i]=rand(a,b);
            System.out.println(array[i]);
        }
    }
}
