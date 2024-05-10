import java.util.Arrays;

import static java.lang.Math.min;

public class SpiralArray {
    public static void main(String[] args) {
        int arraySize = 5;
        int[][] array = new int[arraySize][arraySize];

        // Start at center and spiral out
        int currentX = arraySize / 2, currentY = arraySize / 2;
        int currentNum = arraySize * arraySize;
        array[currentY][currentX] = currentNum;

        int armLength = 1;
        int direction = 0;  // 0=L, 1=D, 2=R, 3=U

        // Top left will be the last location to be filled
        while (array[0][0] == 0) {
            for (int i=0; i < armLength; i++) {
                switch (direction) {
                    case 0 -> currentX--;
                    case 1 -> currentY++;
                    case 2 -> currentX++;
                    case 3 -> currentY--;
                }
                array[currentY][currentX] = --currentNum;
            }

            direction = (direction + 1) % 4;
            // Cap length at 4 to prevent OOB access at the end
            if (direction % 2 == 0 && armLength < 4) {
                armLength++;
            }
        }
        for (int i=0; i < arraySize; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
