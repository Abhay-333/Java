package Module3;

//class A {
//    public int i;
//    public int j;
//
//    A() {
//        i = 1;
//        j = 2;
//    }
//}
//
//class B extends A {
//    int a;
//
//    B() {
//        super();
//    }
//}
//
//
//class superClass {
//    public static void main(String[] args) {
//        B obj = new B();
//        System.out.println(obj.i + " " + obj.j);
//    }
//}

// Java mey Agar koi class ka parent class nahi hota hai toh uss class ka parent class hota hai Object class
// Object is the root class

class A extends Object{
    int data = 100;

    public void m1() {

    }
}

class B extends A {
    int data = 50;

    public void m2() {
        int data = 10;
        System.out.println(data);   // when use data without any keyword then it will refer to the nearest data
        // variable
        System.out.println(this.data);   // when we use this keyword then it will refer to the variable which is
        // available in local class

        System.out.println(super.data);   // when we use super keyword then it will refer to the parent's class local
        // variable

    }

    public static void main(String[] args) {
        B obj1 = new B();
        obj1.m2();
    }

}


