public class RevertString {

    /**
     * Invierte el orden de los caracteres en la cadena proporcionada.
     *
     * @param text La cadena a invertir.
     * @return La cadena invertida.
     */

    public static String revert(String text) {

        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }

    public static String revert2(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }

    public static String revert3(String text) {
        char[] chars = text.toCharArray();
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;

            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {

        String response1 = revert("HOLA");
        String response2 = revert2("HOLA");
        String response3 = revert3("HOLA");

        System.out.println(response1);
        System.out.println(response2);
        System.out.println(response3);
    }
}
