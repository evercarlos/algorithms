public class IntegerToRoman {

    public static String intToRoman(int number) {
        int[] values = {
                1000, 900, 500, 400,
                100, 90, 50, 40,
                10, 9, 5, 4,
                1
        };
        String[] symbol = {
                "M", "CM", "D", "CD",
                "C", "XC", "L", "XL",
                "X", "IX", "V", "IV",
                "I"
        };

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {

            while (number >= values[i]) {
                roman.append(symbol[i]);
                number -= values[i];

            }

        }

        return roman.toString();
    }


    public static void main(String[] args) {
        System.out.println(intToRoman(3));     // III
        System.out.println(intToRoman(58));    // LVIII
        System.out.println(intToRoman(1994));  // MCMXCIV
    }
}
