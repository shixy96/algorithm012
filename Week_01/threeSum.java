class Solution {
    /*
    * 三数之和
    * 在 nums 中找 a + b + c = 0，不重复
    */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        // k确定边界，i、j两边夹逼
        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] > 0) break;
            if (k > 0 && nums[k] == nums[k - 1]) continue;
            int i = k + 1, j = nums.length - 1;
            while (i < j) {
                int target = nums[i] + nums[j] + nums[k];
                if (target < 0) {
                    while (i < j && nums[i] == nums[++i]);
                } else if (target > 0)  {
                    while (i < j && nums[j] == nums[--j]);
                } else {
                    result.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    while (i < j && nums[i] == nums[++i]);
                    while (i < j && nums[j] == nums[--j]);
                }
            }
        }
        return result;
    }
}