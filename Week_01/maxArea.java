class Solution {
    // 11. 盛水最多的容器
  	/*  point(i, height[i])
        +           +
        |     +     |           +
        |  +  |     |  +        |
        |  |  |  +  |  |  +     |
        |  |  |  |  |  |  |  +  |
        |  |  |  |  |  |  |  |  |
        +--+--+--+--+--+--+--+--+--+
    */
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length -1; i < j;) {
            int w = j - i;
            // 相对短的边向内移动
            int h = height[i] < height[j] ? height[i++] : height[j--];
            max = Math.max(max, w * h);
        }
        return max;
    }
}