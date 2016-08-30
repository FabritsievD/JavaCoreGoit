package module_3.Task3;


public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

    SpecialStudent(String firstName, String lastName, int group){
        super(firstName,lastName,group);
    }

    SpecialStudent(String lastName, Course [] coursesTaken){
        super(lastName, coursesTaken);
    }

    SpecialStudent(long secretkey, String firstName, String lastName, int group){
        super(firstName,lastName,group);

        this.secretKey = secretkey;
    }

    public long getSecretkey() {
        return secretKey;
    }

    public void setSecretkey(long secretkey) {
        this.secretKey = secretkey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    SpecialStudent(String firstName, String lastName, int group, long secretkey){
        super(firstName,lastName,group);

    }

}
