class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0, sum = 0;
        HashSet<Integer> set = new HashSet<>();
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            // Shrink window if duplicate found
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            // Add new element to the set and sum
            set.add(nums[right]);
            sum += nums[right];

            // If we have exactly k elements in the window, check max sum
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                // Move the left pointer to maintain the window size
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }

        return maxSum;
    }
}
