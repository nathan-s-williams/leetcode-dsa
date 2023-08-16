public class RunningSumOfOneDArray {
    public int[] runningSum(int[] nums) {
        int[] prefixArray = new int[nums.length];
        prefixArray[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + nums[i];
        }
        return prefixArray;
    }

    public static void main(String[] args) {
        RunningSumOfOneDArray solution = new RunningSumOfOneDArray();
        int[] output = solution.runningSum(new int[]{1,2,3,4});
        for (int element : output) {
            System.out.print(String.valueOf(element) + ' ');
        }
    }
}
