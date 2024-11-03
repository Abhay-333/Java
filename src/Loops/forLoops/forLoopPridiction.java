package Loops.forLoops;

public class forLoopPridiction {
    public static void main(String[] args) {
//        q1
        int c = 0;
        for(int i =5; i < 10; i+=2){
            c++;   // 1 2 3
        }
        System.out.println(c);  // 3

//        q2
        int i =0;
        for(; i < 5 ;){  // 5<5 exit the loop
            i++;    //1 2 3 4 5
            System.out.print(i); //12345
        }

//        q3            Amazing question

        byte a;
        for(a=1; a > 0; a++ ){  // a will be increment till 127 because that is the range of byte as soon as the a
            // increments to after 127 it will be -128 because byte wraps up when it goes out of range when a = -128,
            // then a > 0 will be checked and therefore -128 > 0 = false and the will be terminated and the value of
            // a is 128
        }
            System.out.println(a);

//        q4
        for(int b = 0; b < 5;){
            System.out.println(i);
        }


    }
}
