import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Given an array of integers {@code nums} and an integer {@code target},
     * returns the indices of the two numbers such that they add up to the target.
     *
     * <p>You may assume that each input would have exactly one solution,
     * and you may not use the same element twice.</p>
     *
     * <p>You can return the answer in any order.</p>
     *
     * <h3>Examples:</h3>
     *
     * <pre>{@code
     * Example 1:
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     *
     * Example 2:
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     *
     * Example 3:
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     * }</pre>
     */


    public static int[] processWithMap(int[] numbers, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            int complement = target - numbers[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(numbers[i], i);
        }
        return new int[]{};
    }

    /**
     * universal
     */
    public static int[] processWithTwoPoint(int[] numbers, int target) {

        int[][] pairs = new int[numbers.length][2];
        for (int i = 0; i < numbers.length; i++) {
            pairs[i][0] = numbers[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, Comparator.comparingInt(value -> value[0]));

        int left = 0, right = numbers.length - 1;

        while (left < right) {

            int sum = pairs[left][0] + pairs[right][0];

            if (sum == target) {
                return new int[]{pairs[left][1], pairs[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{};
    }


    public static void main(String[] args) {

        //EXAMPLE 1
        int[] nums1 = {2, 7, 11, 15};
        System.out.println(Arrays.toString(processWithMap(nums1, 9)));
        //EXAMPLE 2
        int[] nums2 = {3, 2, 4};
        System.out.println(Arrays.toString(processWithMap(nums2, 6)));
        //EXAMPLE 3
        int[] nums3 = {3, 3};
        System.out.println(Arrays.toString(processWithMap(nums3, 6)));

        //EXAMPLE 4
        int[] nums4 = {3, 2, 4};
        System.out.println(Arrays.toString(processWithTwoPoint(nums4, 6)));
    }
}


