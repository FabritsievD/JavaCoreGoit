package module_3.Task3;


public class CollegeStudent extends Student {



    private String collegeName;
    private int rating;
    private long id;

    CollegeStudent (String firstName, String lastName, int group ){
        super( firstName,lastName,group);
    }

    CollegeStudent(String lastName, Course [] coursesTaken){
        super(lastName,coursesTaken);
    }

    CollegeStudent(String collegeName, int rating, long id, String firstName, String lastName, int group ){
        super(firstName,lastName,group);

        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCollegeName() {

        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}
