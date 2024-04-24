package students;

import java.util.Scanner;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private double mark;

    public Student(int id, String firstName, String lastName, double mark) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }

    public void scanInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        this.id = scanner.nextInt();
        System.out.print("Enter first name: ");
        this.firstName = scanner.next();
        System.out.println("Enter last name: ");
        this.lastName = scanner.next();
        System.out.print("Enter mark: ");
        this.mark = scanner.nextDouble();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void printInfo(){
        System.out.printf("%3d|%10s%10s|%5f\n",getId(),getFirstName(),getLastName(),getMark());
    }
    
}
