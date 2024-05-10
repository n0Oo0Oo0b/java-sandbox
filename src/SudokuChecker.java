public class SudokuChecker {
    public static boolean checkGrid(int[][] grid) {
        for (int num = 1; num <= 9; num++) {
            boolean found = false;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (grid[i][j] == num)
                        found = true;
                }
            }

            if (!found)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkGrid(new int[][]{{4, 2, 7}, {1, 6, 3}, {5, 9, 8}}));
        System.out.println(checkGrid(new int[][]{{7, 5, 9}, {2, 4, 8}, {5, 6, 3}}));
    }
}
