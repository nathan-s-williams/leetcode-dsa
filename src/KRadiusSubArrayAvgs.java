public class KRadiusSubArrayAvgs {
    public int[] getAverages(int[] nums, int k) {
        long[] prefixArray = new long[nums.length];
        prefixArray[0] = nums[0];
        for (int i = 1; i < prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + nums[i];
        }

        int[] output = new int[prefixArray.length];
        for (int j = 0; j < prefixArray.length; j++) {
            if (j - k < 0 || j + k > prefixArray.length - 1) {
                output[j] = -1;
            } else {
                output[j] = (int)(((prefixArray[j] - prefixArray[j - k] + nums[j - k])
                        + (prefixArray[j + k] - prefixArray[j])) / (k * 2 + 1));
            }
        }

        return output;
    }

    public static void main(String[] args) {
        KRadiusSubArrayAvgs solution = new KRadiusSubArrayAvgs();
//        int[] output = solution.getAverages(new int[]{7,4,3,9,1,8,5,2,6}, 3);
//        int[] output = solution.getAverages(new int[]{100000}, 0);
        int[] output = solution.getAverages(new int[]{8}, 100000);
        for (int num : output) {
            System.out.print(String.valueOf(num) + ' ');
        }
    }
}
