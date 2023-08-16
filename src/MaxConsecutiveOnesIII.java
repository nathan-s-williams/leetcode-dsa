public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int longestStringOfOnes = 0;
        int numberOfZerosInSubArray = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                numberOfZerosInSubArray++;
            }

            while (numberOfZerosInSubArray > k) {
                if (nums[left++] == 0) {
                    numberOfZerosInSubArray--;
                }
            }

            longestStringOfOnes = Math.max(longestStringOfOnes, right - left + 1);
        }
        return longestStringOfOnes;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnesIII solution = new MaxConsecutiveOnesIII();
        System.out.println(solution.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
        System.out.println(solution.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
    }
}
