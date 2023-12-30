import java.util.HashMap;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(0, -1);
        int count = 0, maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count--;
            }

            if (hash.containsKey(count)) {
                maxLength = Math.max(maxLength, i - hash.get(count));
            } else {
                hash.put(count, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        ContiguousArray solution = new ContiguousArray();
        System.out.println(solution.findMaxLength(new int[]{0,1,0,1}));
    }
}
