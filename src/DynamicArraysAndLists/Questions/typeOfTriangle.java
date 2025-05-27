package DynamicArraysAndLists.Questions;

public class typeOfTriangle {
    public static String bruteForce(int arr[]) {
        int side1 = arr[0], side2 = arr[1], side3 = arr[2], sum = side1 + side2 + side3;
        int sum1 = side1 + side2, sum2 = side2 + side3, sum3 = side1 + side3;

        if (sum1 > side3 || sum2 > side1 || sum3 > side2) {
            if (side1 == side2 && side2 == side3) {
                return "Equilateral Triangle";
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                // Isosceles Triangle
                return "Isosceles";
            } else {
                // Scalene Triangle
                return "Scalene";
            }
        }
        return "none";
    }

    public static void main(String[] args) {
//        int arr[] = {3, 3, 3};
//        int arr[] = {8, 4, 2};
//        int arr[] = {8, 4, 4};
        int arr[] = {1, 1, 7};
//        int arr[] = {3,4,5};
        System.out.print(bruteForce(arr));
    }
}
