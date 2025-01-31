package introToOOPs;

public class Student {
    String name;
    int rollNo;
    String collegeName;

    public Student(){
        // body of default constructor
    }

    public Student(String name, int rollNo, String collegeName){
        // body of parameterized constructor
        this.name = name;
        this.rollNo = rollNo;
        this.collegeName = collegeName;
    }

    public void displayObject(){
        System.out.println(name + " " + rollNo + " " + collegeName);
    }

    // toString is used to display the content of the object in readable format
    // and there is no need to call it explicitly just type sout(nameOftheObject);
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }

    //    public void initial(String name, int rollNo, String collegeName) {
//        this.name = name;       // this = current calling object
//        this.rollNo = rollNo;       // this = current calling object
//        this.collegeName = collegeName;       // this = current calling object
//        System.out.println(name + " " + rollNo + " " + collegeName);
//    }



}
