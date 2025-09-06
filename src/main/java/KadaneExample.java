import java.util.Arrays;

public class KadaneExample {

    // Function to return the maximum subarray sum
    public static int maxSubArraySum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either start new subarray at nums[i] or extend the current one
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    // Function to return both the sum and the subarray
    public static int[] maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i; // start new subarray
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        // Extract subarray
        return Arrays.copyOfRange(nums, start, end + 1);
    }

    // Main method to test
    public static void main(String[] args) {
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2 = {1};
        int[] nums3 = {5,4,-1,7,8};

        // Example 1
        System.out.println("Example 1 Input: " + Arrays.toString(nums1));
        System.out.println("Maximum Subarray Sum: " + maxSubArraySum(nums1));
        System.out.println("Subarray: " + Arrays.toString(maxSubArray(nums1)));

        // Example 2
        System.out.println("\nExample 2 Input: " + Arrays.toString(nums2));
        System.out.println("Maximum Subarray Sum: " + maxSubArraySum(nums2));
        System.out.println("Subarray: " + Arrays.toString(maxSubArray(nums2)));

        // Example 3
        System.out.println("\nExample 3 Input: " + Arrays.toString(nums3));
        System.out.println("Maximum Subarray Sum: " + maxSubArraySum(nums3));
        System.out.println("Subarray: " + Arrays.toString(maxSubArray(nums3)));
    }
}
