import java.util.Arrays;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int arrayLength = nums.length;
        int left = 0;
        int right = arrayLength - 1;
        int[] sortedArray = new int[arrayLength];

        for (int i = arrayLength - 1; i >= 0; i--) {
            int squaredElement = 0;
            if (Math.abs(nums[right]) > Math.abs(nums[left])) {
                squaredElement = nums[right] * nums[right];
                right--;
            } else {
                squaredElement = nums[left] * nums[left];
                left++;
            }

            sortedArray[i] = squaredElement;
        }

        return sortedArray;
    }
    public static void main(String[] args) {
        SquaresOfSortedArray solution = new SquaresOfSortedArray();
        int[] solutionArray = solution.sortedSquares(new int[]{-4,-1,0,3,10});
        for (int intElement : solutionArray) {
            System.out.print(' ' + String.valueOf(intElement));
        }

    }
}
