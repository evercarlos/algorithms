public class LongestCommonPrefix {

    /**
     * Finds the longest common prefix string among an array of strings.
     *
     * <p>If there is no common prefix, returns an empty string ("").</p>
     *
     * <p><b>Example 1:</b></p>
     * <pre>
     * Input:  strs = ["flower", "flow", "flight"]
     * Output: "fl"
     * </pre>
     *
     * <p><b>Example 2:</b></p>
     * <pre>
     * Input:  strs = ["dog", "racecar", "car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     * </pre>
     */


    public static String process1(String[] params) {
        if (params == null || params.length == 0) return "";

        String prefix = params[0];

        for (int i = 1; i < params.length; i++) {

            while (params[i].indexOf(prefix) != 0) {

                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        System.out.println(process1(words)); // "fl"

        String[] words2 = {"dog", "racecar", "car"};
        System.out.println(process1(words2)); // ""
    }
}





