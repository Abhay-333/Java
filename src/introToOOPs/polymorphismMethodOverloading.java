package introToOOPs;

public class polymorphismMethodOverloading {

//    public static int max(int a, int b){    // this is the of method overloading by data type
//        return a >= b ? a : b;
//    }

//    public static double max(double a, double b){   // this is the of method overloading by data type
//        return a >= b ? a : b;
//    }

//    public static double max(double a){  // this is the of method overloading by count of parameters/arguments
//        return a;
//    }

    public static double max(int a, double b){   // this is the of method overloading by data type
        return a >= b ? a : b;
    }

    public static int max(int b, int a){   // this is the of method overloading by data type
        return a >= b ? a : b;
    }

    public static void main(String[] args) {
//        polymorphismMethodOverloading.max(8,9);   // this while run without any error because we have
        // have mentioned the return type and the data type of the parameters, so if we pass a integer value
        // they will accept it but if we pass a double value it will give error.

        // to solve this issue we will create another method called max() with the return type double and the
        // data type of the parameters will also be double

        // Method overloading is usually ask in interview
        // This is known as method overloading
        // This is the concept of polymorphism. polymorphism has its 2 types compile time and run time
        // In which we have seen compile time polymorphism. In compile time polymorphism we have method overloading.
        // Polymorphism means many forms, and we have seen a good example of polymorphism using max function.
//        polymorphismMethodOverloading.max(8.5,9.12);
//        polymorphismMethodOverloading.max(8.5);

        System.out.println(polymorphismMethodOverloading.max(8, 9)); // this will run, in this case where the arguments
        // are int a, double b Or double b , int a
        // but this will fail in int a, int b and double a, double b
        // this will generate ambiguity or confusion for the compiler
//        polymorphismMethodOverloading.max(8, 4); // this will not run, this will give error

        // Method overloading can be achieve in 3 ways:
        // 1. Data type of the parameters/arguments should be different
        // 2. count of parameters/arguments
        // 3. order of parameters/arguments

    }
}
