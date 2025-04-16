package Math;

import java.util.Arrays;

public class primeOfNInRange {

    public static void main(String args[]) {
        // According to Seive Eratosthese Algorithm TC= O(n log(log (n)))
        // O(n log(log (n))) - tc
        int n = 100;
        boolean primeArr[] = new boolean[n + 1]; // because we have to show the values of 0 and 1 as false in arr
        Arrays.fill(primeArr, true);
        primeArr[0] = primeArr[1] = false; // because 0 and 1 are not prime

        for (int i = 2; i * i <= n; i++) {        // so lets start from smallest prime i.e 2
            if (primeArr[i]) {    // if primeArr[0] is true then execute the statement inside if
                for (int j = i * i; j <= n; j += i) {  // this loop will mark all the multiple of current prime number
                    // as false because they are the multiple of current prime number
                    // that means they have factors that violates the condition of prime number therefore we marked
                    // it as false
                    primeArr[j] = false;
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            if(primeArr[i]) System.out.print( i + " ");
        }
    }
}
