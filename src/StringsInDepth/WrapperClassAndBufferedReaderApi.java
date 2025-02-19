package StringsInDepth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WrapperClassAndBufferedReaderApi {
    public static void main(String[] args)throws IOException {  // We need to add this Exception
        Integer a = 5; // example of Wrapper Class

//        InputStreamReader isr = new InputStreamReader(System.in);     // InputStreamReader is not that capable to
        // read a line but BufferedReader helps it to read input line by line

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    // BufferedReader acts like a
        // catalyst in the reaction
//        Integer b = Integer.parseInt(br.readLine());
//        Integer c = Integer.parseInt(br.readLine());
//        System.out.println(b+c);

        // ISR and BufferedReader solves the issue that we have faced using scanner API
        // we cannot give input as: 10 10
        // this will give error because it is trying to convert the space between those numbers into int

        System.out.println(Double.valueOf(2.31));
    }
}
