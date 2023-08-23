import java.util.HashSet;
import java.util.Set;

public class CountingElements {
    public int countElements(int[] arr) {
        Set<Integer> intSequence = new HashSet<>();
        for (int num : arr) {
            intSequence.add(num);
        }

        int output = 0;
        for (int num : arr) {
            if (intSequence.contains(num + 1)) {
                output += 1;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        CountingElements solution = new CountingElements();
        System.out.println(solution.countElements(new int[]{1,2,3}));
    }
}
