package Module3.StaticKeywordAndInitialiserBlock;

public class StaticKeyword {
    int a = 12; // this variable is non static that means it belongs to the object
    static int b; // this is a static variable, it doesnt belongs to the object but it belongs to the class, and it
    // is shared with the object but it is associated with the class

    public void m1(){   // Non-static method
        // belongs to object
        a=41;   // non-static method trying to access non-static variable = true
        b=11;   // non-static method trying to access static variable = true
        m2(); // can access it
    }

    public static void m2(){ // Static method
        // belongs to class
//        a=41;   // Static method trying to access non-static variable = false, we also cannot we this keyword here
        b=11;   // Static method trying to access static variable = true
//        m1(); cannot access it
    }

    public static void main(String[] args) {
        StaticKeyword obj1 = new StaticKeyword();
        StaticKeyword obj2 = new StaticKeyword();
//        System.out.println(obj1.a); // accessing a non static variable through object

        obj1.b = 23; // accessing a static variable through object

        // in the following code line.no 14 we are trying to access a static variable using object but behind the
        // scene it access the variable like this (StaticKeyword.b) and this is the right the way to access it.


        obj2.b = 42;    // and since static variable belongs to class, then if we tried to modify
        // the value of b using obj2  then the original value will get change.

        System.out.println(obj1.b);
        System.out.println(obj2.b);
    }
}
