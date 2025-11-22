public class BinarySearch {

    /**
     * Encuentra si un número está en un array ordenado.
     *
     * @param data Input: [1,3,5,7,9] target = 7.
     * @return true.
     * O(log n)
     */

    public static boolean search(int[] data, int target) {

        int left = 0;
        int right = data.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (data[mid] == target) return true;
            if (data[mid] < target) left = left + 1;
            else right = right - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println(search(arr, 3));

        int a = 2_147_483_647; // valor máximo de int
        int b = 1;
        int c = a + b;
        System.out.println(c);

    }
}
