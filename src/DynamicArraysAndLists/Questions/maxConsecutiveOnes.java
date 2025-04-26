package DynamicArraysAndLists.Questions;

public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 1, 1, 1,1};
        int oneCounter = 0, probableAnswer = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                oneCounter++;
                if (probableAnswer < oneCounter) {
                    probableAnswer = oneCounter;
                }
            } else {
                oneCounter = 0;
            }
        }

        System.out.println(oneCounter);
        System.out.println(probableAnswer);
    }
}
