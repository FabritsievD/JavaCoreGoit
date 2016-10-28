package Module_10.Task_5;


public class Test {

    public static void allExceptions(int i) throws SimpleException,BadException,TerribleException{
        if(i==1){
            throw new SimpleException();
        }
        else if(i==2){
            throw new BadException();
        } else if(i==3){
            throw new TerribleException();
        }
        else {
            System.out.println(i);
        }
        }

    public static void main(String[] args) {

        for (int i = 1; i <5 ; i++) {

            try {
                allExceptions(i);

            } catch (SimpleException e) {
                System.err.println("SimpleEx");
            } catch (BadException e) {
                System.err.println("BadEx");
            } catch (TerribleException e) {
                System.err.println("TerribleEx");
            }
        }
    }
    }


