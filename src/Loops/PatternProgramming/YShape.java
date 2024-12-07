package Loops.PatternProgramming;

public class YShape {
    public static void main(String[] args) {
        int n = 10,k=0;

        for (int i = n - 2; i >= 1; i--) {

            for (k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

//            for(int l = n-3; l >= 1; l--){
//                System.out.println("*");
//            }
            System.out.println();
        }




        for (int m = n-3; m >= 1; m--) {
            for(int o = 1; o < k; o++){
                System.out.print(" ");
            }
            System.out.println("*");
        }


    }
}
