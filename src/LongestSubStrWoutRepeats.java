import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStrWoutRepeats {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        Set<Character> substring = new HashSet<>();
        int left = 0;
        int substringLength = 0;
        for (int right = 0; right < s.length(); right++) {
            while (left < right && substring.contains(s.charAt(right))) {
                substring.remove(s.charAt(left));
                left++;
            }

            substring.add(s.charAt(right));
            substringLength = Math.max(substringLength, right - left + 1);
        }

        return substringLength;
    }

    public static void main(String[] args) {
        LongestSubStrWoutRepeats solution = new LongestSubStrWoutRepeats();
        System.out.println(solution.lengthOfLongestSubstring("dvdf"));
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }
}
