package module_9;


public class User {

    private long id;
    private String firstName;
    private String lastName;private String city;

    private int balance;

    public User(long id, String firstName, String lastName, String city, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.balance = balance;
    }

    public String getCity() {
        return city;
    }

    public String getLastName() {
        return lastName;
    }
}
