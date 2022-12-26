package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        for (int x = 1; x <= lastPrinted; x++) {
            if (x % 3 == 0) {
                continue;
            }
            System.out.println(x);
        }

    }
}
