package Module3.AccessModifiersAndFinalKeyword;

import Module3.AccessModifiersAndFinalKeyword.package1.Class2;

public class Class1 extends Class2 {   // if i want to access a member from another class in another package
    // using protected access modifier then i should inherit the class in which the data member is present

    public static void main(String[] args) {
        Class1 obj = new Class1();
//        System.out.println(obj.a = 42); // it will print the value when the int a; in Class2 has public or protected
        // access modifier
        // Protected - package level but exception(we need to inherit the child class in which int a; is available)

        System.out.println(obj.m1());

        System.out.println(obj.a=224);
    }
}