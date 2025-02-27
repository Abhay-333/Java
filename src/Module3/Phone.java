package Module3;

abstract public class Phone { // example
    abstract void call();

    // what are the chances of confirmation that every phone company has the same method or technique to make
    // a call, if we define a method here for making a call then we are restricting other techniques to make
    // a call, we said there should be only one technique to make a call, which is obviously wrong thing. To
    // solve this problem we must declare a call() method here and later we should use it accordingly for
    // other phone models. how to declare a method? we can do that using abstract key word in java
    // Abstract keyword is used to declare a method or a class. If we gave a class abstract keyword then the
    // object of that class is not created. since abstract classes cannot be instantiated,
    // they can have both abstract and non-abstract methods. Abstract methods are the declaration of methods that
    // will be created by the child classes of its own

//        ✅ An abstract method is a method that has only a declaration but no implementation (body).
//        ✅ It must be implemented by the child (subclass) that extends the abstract class.
//        ✅ An abstract method can only exist inside an abstract class or an interface.

    // Conclusion: That means we are going to create an abstract class in that we can create an abstract method
    // or method declaration and then we are going to use it in the another child class in which we wanted to
    // make the object.

//        ✅ We create an abstract class with an abstract method (a method declaration).
//        ✅ A child class (subclass) extends the abstract class and provides an implementation for the abstract method.
//        ✅ We create an object of the child class to use the implemented method.

    abstract void textMsg();

    abstract void callLogs();
}

abstract class SmartPhone extends Phone {    // if we dont create this class as abstract then we will get an error saying
    // that, we should define call(), textMsg(), callLogs() these methods in this class or else create this class
    // as abstract

    abstract void Camera();

    abstract void browser();
}

class SamsungS24 extends SmartPhone {

    @Override // this is known as annotation
    void Camera() {

    }

    @Override
    void browser() {

    }

    @Override
    void call() {

    }

    @Override
    void textMsg() {

    }

    @Override
    void callLogs() {

    }

    public static void main(String[] args) {
        SamsungS24 obj = new SamsungS24();
    }
}
