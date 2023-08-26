import java.util.*;

public class FindPlayersWithZeroOrOneLosses {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> losses = new HashMap<>();
        Set<Integer> players = new HashSet<>();
        for (int[] match : matches) {
            losses.put(match[1], losses.getOrDefault(match[1], 0) + 1);
            players.add(match[0]);
            players.add(match[1]);
        }

        Integer[] playersArray = players.toArray(new Integer[0]);
        Arrays.sort(playersArray);
        ArrayList<Integer> ZeroLosses = new ArrayList<>();
        ArrayList<Integer> OneLosses = new ArrayList<>();
        for (Integer player : playersArray) {
            if (!losses.containsKey(player)) {
                ZeroLosses.add(player);
            } else if (losses.get(player) == 1) {
                OneLosses.add(player);
            }
        }

        return new ArrayList<>(Arrays.asList(ZeroLosses, OneLosses));
    }

    public static void main(String[] args) {
        FindPlayersWithZeroOrOneLosses solution = new FindPlayersWithZeroOrOneLosses();
        List<List<Integer>> output = solution.findWinners(
                new int[][]{{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}}
        );

        for (List<Integer> players : output) {
            for (int player : players) {
                System.out.print(player + ' ');
            }
            System.out.println();
        }

    }
}
