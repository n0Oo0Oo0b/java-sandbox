import java.util.Arrays;

public class ImageProcessor {
    public static void main(String[] args) {
        boolean[][] mat = new boolean[][] {
                // CGoL glider
                {false, false, true},
                {true, false, true},
                {false, true, true},
        };

        rotateInPlace(mat);
        for (boolean[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static boolean[][] invert(boolean[][] array) {
        // Inverts an image, represented by a square boolean array
        int size = array.length;
        boolean[][] inverted = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                inverted[i][j] = !array[i][j];
            }
        }
        return inverted;
    }

    // b.i) clockwise 270°
    // b.ii) So that the algorithm only does the required amount of rotates
    //       e.g. K=5 -> rotates once == rotate 5 times

    public static boolean[][] rotate(boolean[][] array) {
       // Rotates an image 90 degrees clockwise
       int size = array.length;
       boolean[][] rotated = new boolean[size][size];
       for (int i = 0; i < size; i++) {
           for (int j = 0; j < size; j++) {
               rotated[i][j] = array[size-j-1][i];
           }
       }
       return rotated;
    }

    public static void rotateInPlace(boolean[][] array) {
        // Rotates an image 90 degrees clockwise in-place
        int size = array.length;
        // Transpose
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                // Swap
                array[i][j] ^= array[j][i];
                array[j][i] ^= array[i][j];
                array[i][j] ^= array[j][i];
            }
        }
        // Flip rows
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size/2; j++) {
                array[i][j] ^= array[i][size-1-j];
                array[i][size-1-j] ^= array[i][j];
                array[i][j] ^= array[i][size-1-j];
            }
        }
    }
}
