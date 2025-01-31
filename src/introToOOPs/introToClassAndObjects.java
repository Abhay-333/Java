package introToOOPs;

public class introToClassAndObjects {
    public static void main(String[] args) {
        Student student1 = new Student("Abhay", 30, "DY Patil");        // ye parameterized constructor ko call kr
        // rahe hai
        Student student2 = new Student("Rahul", 80, "M M College"); // ye parameterized constructor ko call kr rahe hai
        Student student3 = new Student();      // ye default constructor ko implicit call kr raha hai
        System.out.println(student3);
        System.out.println(student2);
        System.out.println(student1);

//        student1.initial("Abhay", 30, "DY Patil");

//        student1.name = "Abhay";
//        student1.rollNo = 30;
//        student1.collegeName = "Patil";


    }
}
