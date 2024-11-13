package Loops.forLoops.Questions;

import java.util.Scanner;

public class PrimeFactorsOfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int currentFactor = 2;
        int primeFactors = 0;


        if (n <= 1) {               // If n = 0,1
            System.out.println(n);
        } else {

            int newN = n;
            for (int i = 1; i <= n; i++) {

                if (n > 1) {
                    if (newN % currentFactor == 0) {
                        primeFactors = currentFactor;
                        newN = newN / currentFactor;
                        System.out.println(primeFactors);
                    } else {
                        currentFactor++;
                    }

                }
            }


//            int factorsCount = 0;
//            for (int i = 2; i <= n; i++) {
//
//                System.out.println(i);          // here i is factors of n
//                if (n % i == 0) {             // If n = 3,4,31
//                    factorsCount++;
////                    System.out.println(factorsCount);          // here factors is count of i that means number of
////                    factors
//
//                    for (int j = 2; j <= factorsCount; j++) {
//                        if (n % currentFactor == 0) {
//                            primeFactors = currentFactor;
//                            n = n / currentFactor;
////                            System.out.println(primeFactors);
//                        } else {
//                            currentFactor++;
//                        }
//                    }


//                }

//            }

//            if (factorsCount == 1) {
//                System.out.println(primeFactors = n);
//            }

        }


    }
}
