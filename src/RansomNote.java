import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineCharacters = new HashMap<>();
        //Load hash map with magazine characters
        for (char character : magazine.toCharArray()) {
            if (magazineCharacters.containsKey(character)) {
                magazineCharacters.put(character,magazineCharacters.get(character) + 1);
            } else {
                magazineCharacters.put(character, 1);
            }
        }

        //Check if we can make ransomNote with magazine
        for (char character : ransomNote.toCharArray()) {
            if (magazineCharacters.containsKey(character)
                && magazineCharacters.get(character) > 0) {
                magazineCharacters.put(character, magazineCharacters.get(character) - 1);
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        RansomNote solution = new RansomNote();
        System.out.println(solution.canConstruct("a", "b"));
        System.out.println(solution.canConstruct("aa", "ab"));
        System.out.println(solution.canConstruct("aa", "aab"));
    }
}
