import java.util.Arrays;

public class RevertArray {

    /**
     * Invierte el orden del arrays
     *
     * @param 'int[]' numbers = {1, 2, 3, 4, 5};
     * @return La cadena invertida.
     */

    public static void revert(int[] param) {
        int left = 0, right = param.length - 1;

        while (left < right) {

            int tmp = param[left];

            param[left] = param[right];
            param[right] = tmp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] param = {1,2,3,4,5,6};

        revert(param);
        System.out.println(Arrays.toString(param));
    }
}
