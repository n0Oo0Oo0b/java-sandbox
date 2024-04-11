public class NoTriples {
    /* Rust
    //                  reference to a 'slice' (contiguous memory) ~= array
    //                  v----v
    fn no_triples(nums: &[i32]) -> bool {
        nums.windows(3).all(|t| !(t[0] == t[1] && t[1] == t[2]))
        //   ^--------^ ^-^ ^---------------------------------^
        //   |          |   |
        //   |          |   anon function that checks for triples
        //   |          true if f(x) returns true for each item
        //   iterate over windows of length 3
        // return is implicit for last expression in body
    }
     */

    public static boolean noTriples(int[] numbers) {
        if (numbers.length < 3) return true;

        for (int i = 0; i < numbers.length-2; i++) {
            if (numbers[i] == numbers[i+1] && numbers[i+1] == numbers[i+2]) {
                return false;
            }
        }
        return true;
    }

    @SuppressWarnings("PointlessBooleanExpression")
    public static void main(String[] args) {
        assert noTriples(new int[]{1, 1, 2, 2, 1}) == false;
        assert noTriples(new int[]{1, 1, 2, 2, 2, 1}) == false;
        assert noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}) == false;
        System.out.println(noTriples(new int[]{1, 1, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
    }
}
