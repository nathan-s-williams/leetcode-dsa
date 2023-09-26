public class MinSizeSubArray {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int subArraySum = 0;
        int subArrayLength = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            subArraySum += nums[right];
            if (subArraySum < target) {
                continue;
            }

            while (subArraySum >= target) {
                subArrayLength = Math.min(subArrayLength, right - left + 1);
                subArraySum -= nums[left++];
            }
        }

        return subArrayLength == Integer.MAX_VALUE ? 0 : subArrayLength;
    }

    public static void main(String[] args) {
        MinSizeSubArray solution = new MinSizeSubArray();
        System.out.println(solution.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
        System.out.println(solution.minSubArrayLen(4, new int[]{1,4,4}));
        System.out.println(solution.minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1}));
    }
}
