
public class Practice {

    /****
     *madam
     *
     * **/

    public static boolean isPolindrome(String text) {

        int left = 0, right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPolindrome("ever"));
    }
}
