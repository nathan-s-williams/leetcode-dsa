import java.util.HashMap;

public class LargestUniqueNumber {
    public int largestUniqueNumber(int[] nums) {
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        for (int num : nums) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }

        int largestUniqueNumber = Integer.MIN_VALUE;
        Integer[] frequencySet = frequencies.keySet().toArray(new Integer[0]);
        for (Integer num : frequencySet) {
            if (frequencies.get(num) == 1) {
                largestUniqueNumber = Math.max(largestUniqueNumber, num);
            }
        }

        if (largestUniqueNumber > Integer.MIN_VALUE) {
            return largestUniqueNumber;
        }

        return -1;
    }

    public static void main(String[] args) {
        LargestUniqueNumber solution = new LargestUniqueNumber();
        System.out.println(solution.largestUniqueNumber(new int[]{5,7,3,9,4,9,8,3,1}));
    }
}
