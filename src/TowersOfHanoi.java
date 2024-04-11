import java.util.EmptyStackException;
import java.util.Vector;

import static java.lang.Math.pow;

class HanoiStack extends Vector<Integer> {
    public HanoiStack() {}

    public HanoiStack(int size) {
        this();
        for (int i=size; i>0; i--) {
            this.push(i);
        }
    }

    public int peek() {
        return !this.isEmpty() ? this.lastElement() : Integer.MAX_VALUE;
    }

    public void push(int value) {
        if (value > this.peek()) {
            throw new IllegalArgumentException("Cannot place larger disk on smaller disk");
        }
        this.add(value);
    }

    public int pop() {
        return this.remove(this.size() - 1);
    }

    public static void modeDiskBetween(HanoiStack first, HanoiStack second) {
        if (first.isEmpty() && second.isEmpty()) {
            throw new EmptyStackException();
        }
        int topOfFirst = first.peek();
        int topOfSecond = !second.isEmpty() ? second.peek() : Integer.MAX_VALUE;
        if (topOfFirst < topOfSecond) {
            // first -> second
            second.push(first.pop());
        } else {
            // second -> first
            first.push(second.pop());
        }
    }
}

public class TowersOfHanoi {
    public static void main(String[] args) {
        // Parse arguments
        if (args.length != 1) {
            throw new RuntimeException("Invalid command line arguments. Correct usage: TowersOfHanoi [n]");
        }
        int numberOfDisks;
        try {
            numberOfDisks = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Invalid number: '" + args[0] + "'");
        }

        // Initialize stacks
        HanoiStack source = new HanoiStack(numberOfDisks);
        HanoiStack destination = new HanoiStack();
        HanoiStack temporary = new HanoiStack();

        // Run algorithm
        for (int i=0; i < pow(2, numberOfDisks)-1; i++) {
            switch (i % 3) {
                case 0 -> HanoiStack.modeDiskBetween(source, numberOfDisks % 2 == 1 ? destination : temporary);
                case 1 -> HanoiStack.modeDiskBetween(source, numberOfDisks % 2 == 0 ? destination : temporary);
                case 2 -> HanoiStack.modeDiskBetween(temporary, destination);
            }

            System.out.printf("Step %3d: S %-25s T %-25s D %-25s%n", i+1, source, temporary, destination);
        }

    }
}
