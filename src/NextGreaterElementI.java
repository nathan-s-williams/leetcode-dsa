import java.util.*;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        HashMap<Integer, Integer> greaterIntegerMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i : nums2) {
            while(!stack.isEmpty() && i > stack.peek()) {
                greaterIntegerMap.put(stack.pop(), i);
            }
            stack.push(i);
        }
        for(int j = 0; j < nums1.length; j++) {
            result[j] = greaterIntegerMap.getOrDefault(nums1[j], -1);
        }
        return result;
    }

    public static void main(String[] args) {
        NextGreaterElementI nextGreaterElementI = new NextGreaterElementI();
        int[] solution = nextGreaterElementI.nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4});
        for(int answer : solution) {
            System.out.println(answer);
        }
    }
}
