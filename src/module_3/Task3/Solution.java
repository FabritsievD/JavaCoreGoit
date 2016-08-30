package module_3.Task3;


public class Solution {
    public static void main(String[] args) {

        Course course1 = new Course();
        Course course2 = new Course();
        Course course3 = new Course();
        Course course4 = new Course();
        Course course5 = new Course();

        Student student1 = new Student("Chasy","Lane",23);
        Student student2 = new Student("Butch", new Course[] {course1,course2});

        CollegeStudent collegeStudent1 = new CollegeStudent("Jimmy","Pop",23);
        CollegeStudent collegeStudent2 = new CollegeStudent("Vega", new Course [] {course3,course4,course5});
        CollegeStudent collegeStudent3 = new CollegeStudent("Harvard", 5, 450234, "Denis", "Rodman",34);


        SpecialStudent specialStudent1 = new SpecialStudent("Magic","Jonson",45);
        SpecialStudent specialStudent2 = new SpecialStudent("Box", new Course[]{course2,course5});
        SpecialStudent specialStudent3 = new SpecialStudent(785369, "Sddam","Husein");



    }
}
