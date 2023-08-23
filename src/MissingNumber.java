import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        Set<Integer> intSequence = new HashSet<>();
        for (int integer : nums) {
            intSequence.add(integer);
        }

        for (int i = 0; i <= nums.length + 1; i++) {
            if (!intSequence.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MissingNumber solution = new MissingNumber();
        System.out.println(solution.missingNumber(new int[]{3,0,1}));
    }
}
