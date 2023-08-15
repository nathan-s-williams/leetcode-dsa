public class ReverseString {
    public void reverseString(char[] s) {
        if (s.length == 1) {
            return;
        }

        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char characterToSwitch = s[left];
            s[left] = s[right];
            s[right] = characterToSwitch;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseString solution = new ReverseString();
        char[] arr = new char[]{'h','e','l','l','o'};
        solution.reverseString(arr);
        System.out.println(arr);
    }
}
