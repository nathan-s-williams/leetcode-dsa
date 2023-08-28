import java.util.HashMap;

public class MaximumNumberOfBallons {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> frequencies = new HashMap<>();
        for (char letter : text.toCharArray()) {
            frequencies.put(letter, frequencies.getOrDefault(letter, 0) + 1);
        }

        if (frequencies.containsKey('l')) {
            frequencies.put('l', frequencies.get('l') / 2);
        }

        if (frequencies.containsKey('o')) {
            frequencies.put('o', frequencies.get('o') / 2);
        }

        int minFrequency = Integer.MAX_VALUE;
        for (char letter : "balloon".toCharArray()) {
            if (!frequencies.containsKey(letter)) {
                return 0;
            }

            minFrequency = Math.min(minFrequency, frequencies.get(letter));
        }

        return minFrequency;
    }

    public static void main(String[] args) {
        MaximumNumberOfBallons solution = new MaximumNumberOfBallons();
        System.out.println(solution.maxNumberOfBalloons("balon"));
    }
}
