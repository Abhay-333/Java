package Module3;

class ABC {
    int data = 100;

    public ABC() {
        // default constructor
    }

    public ABC(int a) {
//            this() → Calls a constructor within the same class.
//            this(); //here this keyword is used to call the default constructor
        // and if we call a constructor with another constructor it is called constructor chaining
    }

    public void m1() {
        System.out.println("This is m1 of class ABC");
    }
}

class XYZ extends ABC {
    int data = 50;
    XYZ() {
//            super() → Calls a constructor from the parent class.
        super(); // if we gave a argument here then the call will go to the parent's  parameterized constructor
    }

//    public void m1() {  // example of overriding
//        System.out.println("This is m1 of class XYZ");
//            System.out.println(this);
//    }

    public static void main(String[] args) {
        XYZ obj = new XYZ();
        // parent reference can point to child's object
        ABC obj1 = new XYZ();       // points to its parent class
        obj1.m1();
        System.out.println(obj1.data);
//        XYZ obj2 = new ABC();     this is not valid in java
    }


}

// Predict the output

class constructorChaining{
    constructorChaining(){
        this(20);
        System.out.println("Default");
    }

    constructorChaining(int x){
        System.out.println("1 Parameter");
        System.out.println("x = " + x);
    }

    constructorChaining(int x, int y){
        this();
        System.out.println("2 parameters");
        System.out.println("x = " + x + "y = " + y + ". Sum = " + (x+y));
    }

}

//public static void main(String[] args) {
//    constructorChaining obj = new constructorChaining(11,12);     Predict the output?
//}

//🚀 Java inner classes require an instance of the outer class, while top-level classes don’t.
// That’s why your code works fine after removing the outer class.

