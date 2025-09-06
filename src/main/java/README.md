# Kadane’s Algorithm – Maximum Subarray Problem

## 📌 Problem Statement
Given an integer array `nums`, find the contiguous subarray (containing at least one number) that has the **largest sum**, and return that sum.

---

## 💡 Idea
Kadane’s Algorithm is an **O(n) dynamic programming approach** to solve the maximum subarray sum problem.

1. Traverse the array while maintaining a **current subarray sum**.
2. If the current sum becomes **negative**, reset it to `nums[i]` (start a new subarray).
3. Keep track of the **maximum sum found so far**.

---

## 📝 Algorithm
1. Initialize:
    - `maxSum = nums[0]`
    - `currentSum = nums[0]`
2. Iterate over the array starting from index 1:
    - `currentSum = max(nums[i], currentSum + nums[i])`
    - `maxSum = max(maxSum, currentSum)`
3. Return `maxSum`

---

## ⏱️ Time & Space Complexity
- **Time Complexity**: `O(n)` (single pass through array)
- **Space Complexity**: `O(1)` (only constant extra space)

---

## 💻 Implementation

### Java
```java
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}
