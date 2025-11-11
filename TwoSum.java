import java.util.Arrays;
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

    public static int[] process(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        //EXAMPLE 1
        int[] nums1 = {2, 7, 11, 15};
        System.out.println(Arrays.toString(process(nums1, 9)));

        //EXAMPLE 2
        int[] nums2 = {3, 2, 4};
        System.out.println(Arrays.toString(process(nums2, 6)));

        //EXAMPLE 3
        int[] nums3 = {3, 3};
        System.out.println(Arrays.toString(process(nums3, 6)));
    }
}
