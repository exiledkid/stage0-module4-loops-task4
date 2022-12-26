package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");

        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");

        } else {
            int sumSkipped = 0;
            int sumCounted = 0;

            for (int x = 1; x <= lastInRow; x++) {
                if (x <= numberToSkip) {
                    sumSkipped = sumSkipped + x;
                } else {
                    sumCounted = sumCounted + x;
                }
            }
            System.out.println("skipped sum is " + sumSkipped);
            System.out.println("counted sum is " + sumCounted);
        }
    }
}
