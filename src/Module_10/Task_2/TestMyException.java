package Module_10.Task_2;


public class TestMyException {
    public static void main(String[] args) {
        try{
          throw  new MyExeption("very bad exception");
        }
        catch (MyExeption e){
            e.errMassage();
        }
    }


    }


