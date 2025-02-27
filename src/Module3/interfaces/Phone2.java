package Module3.interfaces;


interface Phone2 { // when we create class as interface then the methods in it becomes abstract and the class also
    // becomes abstract this is also known as pure abstraction

    void call();

    void callLogs();

    void textMsg();
}

interface Smartphone2 extends Phone2 {
    void internet();

    void browser();

    void touchScreen();
}

class Samsung24 implements Smartphone2{

    // this overridden method should be public. ask google or chatgpt
//      📌 Key Rule:
//      🚨 You cannot reduce the visibility of an overridden method in a subclass or implementing class.
//      ✅ The overridden method must be at least as accessible as the method in the parent class or interface.


    @Override
    public void internet() {

    }

    @Override
    public void browser() {

    }

    @Override
    public void touchScreen() {

    }

    @Override
    public void call() {

    }

    @Override
    public void callLogs() {

    }

    @Override
    public void textMsg() {

    }

    public static void main(String[] args) {
        Samsung24 obj = new Samsung24();
    }

}
