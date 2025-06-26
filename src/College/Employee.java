package College;

import java.util.*;

class Employee {
    String name;
    double salary;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        name = sc.next();
        System.out.println("Enter Salary:");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Salary:" + salary);
    }

    public static void main(String[] args) {
        // Here we have to give name and salary of 5 employee minimum
        Employee[] s = new Employee[5];
        for (int i = 0; i < 5; i++) {
            s[i] = new Employee();
            s[i].accept();
        }
        for (int i = 0; i < 5; i++) {
            s[i].display();
        }
    }
}
