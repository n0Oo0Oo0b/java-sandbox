import java.util.Arrays;


public class arrayProcessing {
    public static void main(String[] args) {
        int[] myArray = new int[] {1, 6, 8, 2, 5, 0, 3, 4, 7, 9};
        bubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
