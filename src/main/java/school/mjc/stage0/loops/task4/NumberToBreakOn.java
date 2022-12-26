package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {

        if (numberToGoUntil < toBreakWith) {

            System.out.println("iterating till the end");
            for (int x = 1; x <= numberToGoUntil; x++) {
                System.out.println(x);
                if (x == numberToGoUntil) {
                    break;
                }
            }
        } else {
            for (int x = 1; x <= numberToGoUntil; x++) {
                if (x == toBreakWith) {
                    System.out.println(x);
                    break;
                }
                System.out.println(x);
            }
        }
    }
}
