package BinarySearch.Level2;

public class kokoEatingBananas {

    public static int search(int piles[], int h) {
        int maxPile = 0;
        for (int pile : piles) {
            maxPile = Math.max(pile, maxPile);
        }
        int start = 1, end = maxPile, possibleAns = maxPile;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            double totalHoursNeeded = 0;
            for (int pile : piles) {
                totalHoursNeeded += Math.ceil((double) pile / mid);
            }
            if (totalHoursNeeded <= h) {
                possibleAns = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return possibleAns;
    }

    public static void main(String[] args) {
        int piles[] = {30, 11, 23, 4, 20};
        int h = 5;
        System.out.println(search(piles, h));
    }
}
