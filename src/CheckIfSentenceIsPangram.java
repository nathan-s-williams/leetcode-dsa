//A pangram is a sentence where every letter of the English alphabet appears at least once.

import java.util.HashSet;
import java.util.Set;

public class CheckIfSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        Set<Character> characterSet = new HashSet<>();
        for (Character character : sentence.toCharArray()) {
            characterSet.add(character);
            if (characterSet.size() == 26) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CheckIfSentenceIsPangram solution = new CheckIfSentenceIsPangram();
//        System.out.println(solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(solution.checkIfPangram("leetcode"));
    }
}
