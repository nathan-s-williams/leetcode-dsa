public class MinValueToGetPosStepByStepSum {
    public int minStartValue(int[] nums) {
        int currentSum = 0;
        int minimumSum = Integer.MAX_VALUE;
        for (int num : nums) {
            currentSum += num;
            minimumSum = Math.min(minimumSum, currentSum);
        }

        if (minimumSum > 0) {
            return 1;
        } else {
            return Math.abs(minimumSum) + 1;
        }
    }

    public static void main(String[] args) {
        MinValueToGetPosStepByStepSum solution = new MinValueToGetPosStepByStepSum();
        System.out.println(solution.minStartValue(new int[]{-3,2,-3,4,2}));
        System.out.println(solution.minStartValue(new int[]{1,2}));
        System.out.println(solution.minStartValue(new int[]{1,-2,-3}));
    }
}
