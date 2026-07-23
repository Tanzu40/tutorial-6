public class Course {

    private String courseCode;
    private String courseName;


    public Course(String courseCode, String courseName) {

        this.courseCode = courseCode;
        this.courseName = courseName;
    }


    // Getter and Setter

    public String getCourseCode() {
        return courseCode;
    }


    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }


    public String getCourseName() {
        return courseName;
    }


    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public void displayCourse(){

        System.out.println("Course Code : " + courseCode);
        System.out.println("Course Name : " + courseName);

    }
}