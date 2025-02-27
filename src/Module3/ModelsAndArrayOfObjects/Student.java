package Module3.ModelsAndArrayOfObjects;

import java.util.Objects;

public class Student {
    private String name;
    private int rollNo;
    private String collegeName;
// private data members can be accessed methods or behaviours of Student class that means we can use private data
// members within local scope

    public Student() {   // Default constructor - initializes the values of keys to default values like name: null;
        // rollNo: 0, collegeName: null,

    }

    public String getName() {   //getName is a getter method which is used to read only private data members we cant
        // update them or write them in getter methods
        return this.name;
    }

    //setName is a setter method which is used to write the data members or we can update the data members using
    // setter method

    public void setName(String name){
        this.name = name;
    }

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    public void setCollegeName(String collegeName){
        this.collegeName = collegeName;
    }

    public Student(String name, int rollNo, String collegeName) {    // parameterized constructor
        this.name = name;
        this.rollNo = rollNo;
        this.collegeName = collegeName;
    }

    @Override
    public boolean equals(Object o) {   // this is used to compare 2 objects
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Objects.equals(name, student.name) && Objects.equals(collegeName, student.collegeName);
    }

    @Override
    public int hashCode() {     // this, generates integer hashcode then that hashcode is compared if same then
        // equal else not equal
        return Objects.hash(name, rollNo, collegeName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }

    public void getData(String name, int rollNo, String collegeName) {  // via method/behaviour
        this.name = name;   //this points to current calling object in this case student2 is the current calling object
        this.rollNo = rollNo;
        this.collegeName = collegeName;
    }

    public void display() {
        System.out.println(this.name);
        System.out.println(this.rollNo);
        System.out.println(this.collegeName);
    }

}
