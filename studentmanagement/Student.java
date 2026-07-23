public class Student extends Person {


    private String studentID;
    private Course course;



    public Student(String studentID, String name, int age, Course course) {

        super(name, age);

        this.studentID = studentID;
        this.course = course;
    }



    public String getStudentID(){

        return studentID;
    }



    public void setStudentID(String studentID){

        this.studentID = studentID;
    }



    public Course getCourse(){

        return course;
    }



    public void setCourse(Course course){

        this.course = course;
    }



    // Method overriding (Polymorphism)

    @Override
    public void displayInfo(){

        System.out.println("----------------------------");
        System.out.println("Student ID : " + studentID);
        System.out.println("Name       : " + getName());
        System.out.println("Age        : " + getAge());

        course.displayCourse();

        System.out.println("----------------------------");

    }

}