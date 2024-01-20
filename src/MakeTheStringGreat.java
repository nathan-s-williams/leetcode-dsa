public class MakeTheStringGreat {
    public String makeGood(String s) {
        if (s.length() == 1) {
            return s;
        }

        StringBuilder greatString = new StringBuilder(s);
        int index = greatString.length() - 2;
        //Have a pointer that traverses through the string.
        //Each time si and si+1 diff = 32, get rid of them
        //Start back at the location just before the deletion of the two characters.
        while (index >= 0) {
            if (Character.toLowerCase(greatString.charAt(index)) == Character.toLowerCase(greatString.charAt(index + 1))) {
                if (greatString.charAt(index) != greatString.charAt(index + 1)) {
                    greatString.delete(index, index + 2);
                    if (index == greatString.length()) {
                        index = greatString.length() - 2;
                    } else if (index == greatString.length() - 1) {
                        index--;
                    }
                    continue;
                }
            }

            index--;
        }

        return greatString.toString();
    }

    public static void main(String[] args) {
        MakeTheStringGreat solution = new MakeTheStringGreat();
        System.out.println(solution.makeGood("s"));
    }
}
