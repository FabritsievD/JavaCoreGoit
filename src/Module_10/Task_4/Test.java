package Module_10.Task_4;


public class Test {

    public static void f(){
        try{
        g();
        }
        catch (ClassCastException e){
            throw new RuntimeException();
        }
    }

    public static void g(){
        throw new ClassCastException();
    }

    public static void main(String[] args) {
        f();
    }
}
