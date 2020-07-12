class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        for (int cur = 0, nextNonZeroIndex = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                // 当前位置和 nextNonZeroIndex 交换
                // 1. nextNonZeroIndex == cur
                // 2. nextNonZeroIndex != cur ，nums[nextNonZeroIndex] == 0
                if (cur != nextNonZeroIndex) {
                    nums[nextNonZeroIndex] = nums[cur];
                    nums[cur] = 0;
                }
                nextNonZeroIndex++;
            }
        }
    }
}