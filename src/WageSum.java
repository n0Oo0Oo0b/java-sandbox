import java.util.Arrays;

class WageSum {

    public static void main(String[] args) {
        int[][] wages = new int[][]{
                {2456,2546,2967,3057,2347,2107,2346,3049,3246,3546,5940,3747},
                {5463,3546,7564,3547,3856,3546,4536,3546,2435,3475,4657,3564},
                {4635,4657,4697,4839,4364,3465,5536,3546,2375,3546,3546,2435},
                {6346,7686,4657,9675,3645,6354,9765,2435,3542,6354,3647,3748},
                {2533,2536,2175,1869,2398,1384,1346,2813,2738,2738,1296,2375}
        };
        int[] salaries = calcWages(wages);
        System.out.println(Arrays.toString(salaries));
    }

    public static int[] calcWages(int[][] wages){
        int[] salary = new int[5];
        for (int i = 0; i < wages.length; i++) {
//            salary[i] = Arrays.stream(wages[i]).sum();
            for (int j = 0; j < wages[0].length; j++) {
                salary[i] += wages[i][j];
            }
        }
        return salary;
    }

}