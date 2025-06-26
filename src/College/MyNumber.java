package College;

class MyNumber {
    private int i;

    MyNumber() {
        i = 0;
    }

    MyNumber(int i) {
        this.i = i;
    }

    void isPositiveNegative() {
        if (i > 0)
            System.out.println("Number is Positive");
        else
            System.out.println("Number is Negative");
    }

    void isEvenOdd() {
        if (i % 2 == 0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
    }

    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]); // Here also the same as previous program, it is a command line agrument
        // program so do it like wise.
        MyNumber m = new MyNumber(a);
        m.isPositiveNegative();
        m.isEvenOdd();
    }
}