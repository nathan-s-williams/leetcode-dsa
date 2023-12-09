public class SimplifyPath {
    public String simplifyPath(String path) {
        StringBuilder unixPath = new StringBuilder();
        int periodCount = 0;
        int charCount = 0;

        unixPath.append('/');
        for (int c = 1; c < path.length(); c++) {
            if (path.charAt(c) == '.') { periodCount++; }
            if (path.charAt(c) != '/') { charCount++; }
            if (path.charAt(c) == '/' || c == path.length() - 1) {
                int deletionIndex = unixPath.length() - 1;

                if (periodCount == 2 && periodCount == charCount) {
                    int backslashDeletions = 1;
                    while ((unixPath.charAt(deletionIndex) != '/' || backslashDeletions > 0) && deletionIndex > 0) {
                        if (unixPath.charAt(deletionIndex) == '/') { backslashDeletions--; }
                        unixPath.deleteCharAt(deletionIndex--);
                    }

                } else if (periodCount == 1 && periodCount == charCount) {
                    while (unixPath.charAt(deletionIndex) != '/') {
                        unixPath.deleteCharAt(deletionIndex--);
                    }
                } else if (path.charAt(c - 1) == '/' && path.charAt(c) == '/') {
                    continue;
                } else {
                    unixPath.append(path.charAt(c));
                }

                if (c == path.length() - 1) { break; }

                charCount = 0;
                periodCount = 0;

            } else {
                unixPath.append(path.charAt(c));
            }
        }

        if (unixPath.length() > 1 && unixPath.charAt(unixPath.length() - 1) == '/') {
            unixPath.deleteCharAt(unixPath.length() - 1);
        }
        return unixPath.toString();
    }

    public static void main(String[] args) {
        SimplifyPath solution = new SimplifyPath();
//        System.out.println(solution.simplifyPath("/home/test/../home2/"));
//        System.out.println(solution.simplifyPath("/home/test/home2/../../"));
        System.out.println(solution.simplifyPath("/.././GVzvE/./xBjU///../..///././//////T/../../.././zu/q/e"));
    }
}




//                    while (unixPath.charAt(deletionIndex) == '/' && deletionIndex > 0) {
//                        unixPath.deleteCharAt(deletionIndex--);
//                    }
//                    unixPath.append(path.charAt(c));