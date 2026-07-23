import java.util.Scanner;


public class Main {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        StudentManager manager = new StudentManager();



        int choice;



        do{


            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");


            System.out.print("Enter choice : ");

            choice = input.nextInt();

            input.nextLine();



            switch(choice){



                case 1:


                    System.out.print("Enter Student ID : ");
                    String id = input.nextLine();


                    System.out.print("Enter Name : ");
                    String name = input.nextLine();


                    System.out.print("Enter Age : ");
                    int age = input.nextInt();

                    input.nextLine();



                    System.out.print("Enter Course Code : ");
                    String code = input.nextLine();



                    System.out.print("Enter Course Name : ");
                    String courseName = input.nextLine();



                    Course course = new Course(code, courseName);


                    Student student =
                    new Student(id, name, age, course);



                    manager.addStudent(student);


                    break;




                case 2:


                    manager.displayStudents();

                    break;



                case 3:


                    System.out.print("Enter Student ID : ");

                    String searchID = input.nextLine();


                    manager.searchStudent(searchID);


                    break;



                case 4:


                    System.out.print("Enter Student ID to delete : ");

                    String deleteID = input.nextLine();


                    manager.deleteStudent(deleteID);


                    break;



                case 5:


                    System.out.println("Thank You. Program Ended.");

                    break;



                default:


                    System.out.println("Invalid Choice");


            }



        }while(choice != 5);



        input.close();


    }

}