package Module_10.Task_1;


public class Task_1  {

    public static void main(String[] args) throws Exception {
        try{
            String test="test exception...";
            throw new Exception(test);
        }
        catch (Exception e){
            System.err.println("Exception has happened");
        }
        finally {
            System.out.println("finally end");
        }
    }

}
