package Loops.whileLoops.Questions;

public class SumUntilSingleDigit {
    public static void main(String[] args) {
        int n = 623456;
        int lastDigitOfSum = 0;

        while(n > 9){

            int sum = 0;

            while(n != 0){
                int lastDigit = n % 10;
                sum += lastDigit;
                n = n / 10;
            }
                n = sum;
        }
                System.out.println(n);

    }
}
