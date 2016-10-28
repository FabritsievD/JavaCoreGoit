package Module_10.Task_3;


public class Test {
    public static void main(String[] args) {


        String someString = null;
        try {
            someString.charAt(1);
        } catch (NullPointerException e){
            System.err.println("very bad string");
        }

    }
}