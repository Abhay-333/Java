package Methods.Questions;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();
            CheckPrime obj = new CheckPrime();
            if(obj.isPrime(n)) System.out.println("Prime");
            else System.out.println("Not Prime");
        }
    }

    public boolean isPrime(int n){
        int countOfDivisors = 0;
        for(int i = n; i >= 1; i--){
            if(n % i == 0){
                countOfDivisors++;
            }
        }
        if(countOfDivisors == 2) return true;
        else return false;
    }

}
