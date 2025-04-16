package Math;

import java.util.Arrays;
import java.util.BitSet;

public class countOfPrime {
    public static int n = 10;
    public static boolean primeArr[] = new boolean[n + 1];

    public static int countPrime(int n) {
        int primeCounter = 0;

        Arrays.fill(primeArr, true);
        primeArr[0] = primeArr[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (primeArr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primeArr[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primeArr[i]) primeCounter++;
        }

        return primeCounter;
    }

    public static int countPrimeUsingBitset(int n) {
        int primCounter = 0;

        BitSet bitset = new BitSet(n);

        bitset.set(2, n);

        for (int i = 2; i * i < n; i++) {
            for (int j = i * i; j < n; j += i) {
                bitset.clear(j);
            }
        }

        for (int i = 0; i < n; i++) {
            if (bitset.get(i)) primCounter++;
        }
        System.out.println(bitset);

        return primCounter;
    }

    public static void main(String[] args) {
//        System.out.println(countPrime(n));
        System.out.println(countPrimeUsingBitset(n));

//        for (int i = 0; i <= n; i++) {
//            if (primeArr[i]) {
//                System.out.print(i + " ");
//            }
//        }
    }
}
