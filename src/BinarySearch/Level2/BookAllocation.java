package BinarySearch.Level2;
public class BookAllocation {

    public static boolean isValidMid(int books[], int capacity, int numberOfStudents) {
        int currentBook = 0;
        int currentStudent = 1;

        for (int book : books) {
            if (currentBook + book > capacity) {
                currentStudent++;
                currentBook = book;
                if (currentStudent > numberOfStudents) return false;
            } else {
                currentBook += book;
            }
        }
        return true;
    }

    public static int minimizeLoad(int books[], int numberOfStudents) {
        if (numberOfStudents > books.length) {
            return -1;
        }
        int maxNumberOfBooks = books[0], sumOfBooks = 0;
        for (int book : books) {
            sumOfBooks += book;
            maxNumberOfBooks = Math.max(maxNumberOfBooks, book);
        }
        int start = maxNumberOfBooks, end = sumOfBooks, possibleAnswer = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (isValidMid(books, mid, numberOfStudents)) {
                possibleAnswer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return possibleAnswer;
    }

    public static void main(String[] args) {
//        int arr[] = {12, 34, 67, 90};
        int arr[] = {2, 6, 5, 3, 7};
        int k = 2;
        System.out.println(minimizeLoad(arr, k));
    }
}
