package Loops.whileLoops.Questions;

public class HCFOfTwoNumbers {
    public static void main(String[] args) {

        int num1 = 1500;
        int num2 = 1300;
        int HCF = 0;
        int primeFactorOfNum1 = 0;
        int primeFactorOfNum2 = 0;
        int HFC = 1;
        int currentFactorOfNum1 = 2;
        int currentFactorOfNum2 = 2;

        // To find the HCF of two numbers we have to find prime factors of both numbers
        // After finding the prime factors of both the numbers we have to find the common Prime
        // factors, After finding the common prime factors we have to multiple and in the end
        // we will get the product of HCF
        // num1 = 1500 , PrimeFactors = 2, 2, 3, 5, 5
        // num2 = 1300 , PrimeFactors = 2, 2, 5, 13
        // In this case we find the product of common primeFactors
        // HCF = 2*2*5 = 20

        if (num1 > num2) {
            for (int i = 1; i <= num1; i++) {     // i =1,2, 3, 4, 5, 6, 7
                if (num1 > 1) {
                    if (num1 % currentFactorOfNum1 == 0) {    /* 750 % 2 = true, 750 % 2 = true, 375 % 2 = false, 375 %
                        // 3 == 0 = true, 125 % 3 == 0 = false, 125 % 4 == 0 = false, 125 % 5 == 0 = true */
                        primeFactorOfNum1 = currentFactorOfNum1;    // 2, 2, 3, 5
                        num1 = num1 / currentFactorOfNum2;      // 750, 750 / 2 = 375, 375 / 3 = 125, 125 / 5 = 25,
                        System.out.println(num1);
                        System.out.println(primeFactorOfNum1);
                    } else {
                        currentFactorOfNum1++;  // currentFactorOfNum1 = 3,4,5
                    }
                }

            }
        }


//        if (num1 > num2) {
//            if(num1 > 1){
//                for (int i = 2; i < num1; i++) {
//                    if (num1 % i == 0 && num2 % i == 0) {
//                        HCF = i;
//                        System.out.println(i);
//                    }
//                }
//            }
//
//                System.out.println(HCF);
//        } else if (num2 > num1) {
//            for (int i = 2; i < num2; i++) {
//                if (num2 % i == 0 && num1 % i == 0) {
//                    HCF = i;
//                }
//            }
//                System.out.println(HCF);
//        } else if (num1 == num2) {
//            for (int i = 2; i < num1; i++) {
//                if (num1 % i == 0) {
//                    HCF = i;
//                }
//            }
//                    System.out.println(HCF);
//        }else if(num1 == 0 || num2 == 0){
//            System.out.println(HCF);
//        }


    }
}

// this approach is to find the prime factors of num1 and num2 but the problem is
//1. We have to compare the primeFactorsOfNum1 and primeFactorsOfNum2, the issue is we cant
// access each primeFactorOfNum1  and primeFactorsOfNum2 at the same time so we have to use a single for Loop
// In that single for loop we have to find out the primeFactorsOfNum1 and primeFactorsOfNum2

//for (int i = 1; i <= num1; i++) {
//        if (num1 % currentFactorOfNum1 == 0) {
//primeFactorOfNum1 = currentFactorOfNum1;
//num1 = num1 / currentFactorOfNum1;
//                } else {
//currentFactorOfNum1++;
//        }
//        }
//
//        for (int j = 1; j <= num2; j++) {
//        if (num2 % currentFactorOfNum2 == 0) {
//primeFactorOfNum2 = currentFactorOfNum2;
//num2 = num2 / currentFactorOfNum2;
//                    System.out.println(primeFactorOfNum2);
//                }else{
//currentFactorOfNum2++;
//        }
//        }