import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        for (char jewel : jewels.toCharArray()) {
            jewelSet.add(jewel);
        }

        int myJewels = 0;
        for (char stone : stones.toCharArray()) {
            if (jewelSet.contains(stone)) {
                myJewels++;
            }
        }
        return myJewels;
    }

    public static void main(String[] args) {
        JewelsAndStones solution = new JewelsAndStones();
        System.out.println(solution.numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(solution.numJewelsInStones("z", "ZZ"));

    }
}
