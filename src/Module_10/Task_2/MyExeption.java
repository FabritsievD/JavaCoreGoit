package Module_10.Task_2;


public class MyExeption extends Exception {

    private String field;

    public MyExeption(String field) {
        this.field = field;
    }

    public void errMassage() {
        System.err.println(field);
    }
}

