class Solution {
	public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
		int lastwo = 1, lastone = 2, cur = 0;
		for (int i = 3; i <= n; i++) {
			cur = lastone + lastwo;
            lastwo = lastone;
			lastone = cur;
		}
		return cur;
	}
}