public class MaximumAverageSubArrayI {
    public double findMaxAverage(int[] nums, int k) {
        int subArraySum = 0;
        double averageOfSubArray = Integer.MIN_VALUE;

        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            subArraySum += nums[right];
            if (right - left + 1 >= k) {
                averageOfSubArray = Math.max(averageOfSubArray, (double) subArraySum / k);
                subArraySum -= nums[left++];
            }
        }
        return averageOfSubArray;
    }

    public static void main(String[] args) {
        MaximumAverageSubArrayI solution = new MaximumAverageSubArrayI();
        System.out.println(solution.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
        System.out.println(solution.findMaxAverage(new int[]{5}, 1));
        System.out.println(solution.findMaxAverage(new int[]{-1}, 1));
    }
}
