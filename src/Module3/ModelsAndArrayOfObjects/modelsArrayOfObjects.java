package Module3.ModelsAndArrayOfObjects;

public class modelsArrayOfObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
//        student1.name = "Abhay";    // via reference
//        student1.rollNo = 30;       // via reference
//        student1.collegeName = "DYP";   // via reference
//
//        System.out.println(student1.name);       // via reference
//        System.out.println(student1.collegeName);       // via reference
//        System.out.println(student1.rollNo);       // via reference


//        Student student2 = new Student();
//        student2.getData("Tejas", 14, "DYP");     // via method
//        student2.display();

//        Student student3 = new Student("Abhay", 30, "DYP");     // via constructor
//        student1.display("Abhay", 30, "DYP");

        Student student4 = new Student("Pratik", 13, "DYP");
        student4.setName("Akshay");
        System.out.println(student4);

//        Student student5 = new Student("Yogesh", 15, "DYP");
//        Student student6 = new Student("Rakesh", 16, "DYP");
//        System.out.println(student5.hashCode() + ", " + student6.hashCode());
//        System.out.println(student6.equals(student6));

        Student studentsData[] = new Student[3];
        studentsData[0] = new Student("Murli", 1, "DYPCOE");
        studentsData[1] = new Student("Datattay", 2, "DYPACS");
        studentsData[2] = new Student("Sonu", 3, "DYP");

//        for (int i = 0; i < studentsData.length; i++) {
//            System.out.println(studentsData[i]);
//        }

//        for (Student s : studentsData) {
//            System.out.println(s);
//        }

    }
}
