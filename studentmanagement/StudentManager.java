import java.util.ArrayList;


public class StudentManager {


    private ArrayList<Student> students;



    public StudentManager(){

        students = new ArrayList<>();

    }



    // Add student

    public void addStudent(Student student){

        students.add(student);

        System.out.println("Student Added Successfully!");

    }



    // Display all students

    public void displayStudents(){


        if(students.isEmpty()){

            System.out.println("No student record found.");

        }
        else{


            for(Student s : students){

                s.displayInfo();

            }

        }

    }




    // Search student

    public void searchStudent(String id){


        boolean found = false;


        for(Student s : students){


            if(s.getStudentID().equals(id)){


                System.out.println("Student Found");

                s.displayInfo();

                found = true;

                break;

            }

        }



        if(!found){

            System.out.println("Student Not Found");

        }


    }



    // Delete student

    public void deleteStudent(String id){


        boolean removed = students.removeIf(
                s -> s.getStudentID().equals(id)
        );


        if(removed){

            System.out.println("Student Deleted Successfully");

        }
        else{

            System.out.println("Student Not Found");

        }


    }

}