package students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentList {
    private ArrayList<Student> list;
    private int length;

    public StudentList() {
        list = new ArrayList<>();
    }

    public ArrayList<Student> findByName(String name) {
        boolean found = false;
        ArrayList<Student> students = new ArrayList<>();

        for (Student s : list) {
            String fullName = new String(s.getFirstName() + " " + s.getLastName().toLowerCase());
            if (fullName.matches("(.*)" + name.toLowerCase() + ".*")) {
                students.add(s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
        return students;
    }

    public void addStudent(Student s) {
        list.add(s);
    }

    public void removeStudent(int id) {
        boolean found = false;
        for (Student s : list) {
            if (s.getId() == id) {
                int choice;
                System.out.println("Are you sure deleting this student? (1.Yes or 2.No)");
                choice = new Scanner(System.in).nextInt();
                if (choice== 1){
                    list.remove(s);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Can't find this student with id"+ id);
        }
    }

    public void sortByMarks(){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return new Double(o2.getMark()).compareTo(o1.getMark());
            }
        });
    }

    public void showList(){
        for (Student s : list) {
            s.printInfo();
        }
    }

    public void showList(ArrayList<Student> sList){
        for (Student s : sList) {
            s.printInfo();
        }
    }

    public Student findById(int id) {
        for (Student s : list) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
}
