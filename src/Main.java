import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static int target;
    static int index = 0;
    static int[] nums;
    static int[] resultSet;
    static boolean matchTarget = false;
    public static void main(String[] args)
    {
        System.out.println(check());
    }

    public static int[] check()
    {

        while (!matchTarget)
        {
            if (nums[index] + nums[index + 1] == target)
            {
                resultSet = new int[]{index, index + 1};
                System.out.println("Because nums["+index+"]"+" + " +
                        "nums["+ (1+ index)+"] == "+target + ", we return "+Arrays.toString(resultSet));
                break;

            }
            else
            {
                resultSet = null;
                index++;
            }
        }
        index =0;
        return resultSet;
    }
}

/* ChatGPT answer
import java.sql.Array;
        import java.util.ArrayList;
        import java.util.Arrays;
class Solution {
    static int target;
    static int index = 0;
    static int[] nums;
    static int[] resultSet;
    static boolean matchTarget = false;
    public int[] twoSum(int[] nums, int target) {

        // Create a map to store the indices of the elements in the array
        Map<Integer, Integer> indices = new HashMap<>();

        // Iterate over the elements in the array
        for (int i = 0; i < nums.length; i++) {
            // Check if target - nums[i] is in the map
            if (indices.containsKey(target - nums[i])) {
                // If it is, then we have found the two numbers that add up to target
                // Return the indices of these two numbers
                return new int[] {indices.get(target - nums[i]), i};
            }
            // If target - nums[i] is not in the map, add the index of nums[i] to the map
            indices.put(nums[i], i);
        }

        // If the two numbers were not found, return an empty array
        return new int[0];
    }
}
*/




