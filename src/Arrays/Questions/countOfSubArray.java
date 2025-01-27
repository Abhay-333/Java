package Arrays.Questions;

public class countOfSubArray {
    public static void main(String[] args) {
        int arr[] = {-1, 1, -1, 1, -1}, target = 0;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
