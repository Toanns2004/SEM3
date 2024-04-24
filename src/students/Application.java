package students;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    private static Scanner input = new Scanner(System.in);
    private static StudentList studentList ;

    public static void menu(){
        System.out.println("1. Add a new students the list");
        System.out.println("2. Delete a student from the list");
        System.out.println("3. Search by name");
        System.out.println("4. Search by id");
        System.out.println("5. Print student info in descending order of mark");
        System.out.println("6. Exit");
    }

    public static void main(String[] args) {
        studentList = new StudentList();
        menu();
        while (true){
            int choice;
            System.out.println("Enter your choice");
            choice = input.nextInt();
            if (choice == 1){
                addStudent();
                menu();
            }else if (choice == 2){
                deleteStudent();
                menu();
            }else if (choice == 3){
                searchByName();
                menu();

            }else if (choice == 4){
                searchById();
                menu();

            }else if (choice == 5){
                printSorted();
                menu();

            }else if (choice == 6){
                System.exit(0);
            }
        }
    }

    public static void addStudent(){
        int id = 0;
        String fn;
        String ln;
        double mark;
        System.out.println("Enter student ID: ");
        id = input.nextInt();
        System.out.println("Enter student first name: ");
        fn = input.next();
        System.out.println("Enter student last name: ");
        ln = input.next();
        System.out.println("Enter student mark: ");
        mark = input.nextDouble();
        Student student = new Student(id, fn, ln, mark);
        studentList.addStudent(student);
    }

    public static void deleteStudent(){
        int id;
        System.out.println("Enter student ID: ");
        id = input.nextInt();
        studentList.removeStudent(id);
    }

    public static void searchByName(){
        String name;
        System.out.println("Enter student name: ");
        name = input.next();
        ArrayList<Student> list = studentList.findByName(name);
        studentList.showList(list);
    }


    public static void searchById(){
        int id;
        System.out.println("Enter student ID: ");
        id = input.nextInt();
        Student student = studentList.findById(id);
        if(student != null){
            student.printInfo();
        }else {
            System.out.println("Student not found");
        }
    }

    public static void printSorted(){
        studentList.sortByMarks();
        studentList.showList();
    }
}
