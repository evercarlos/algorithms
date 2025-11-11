public class Polindrome {

    public static boolean isPolindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "madam";
        System.out.println(isPolindrome(text));
    }
}
