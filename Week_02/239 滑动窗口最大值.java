class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();
        int len = nums.length, index = 0;
        int[] result = new int[len - k + 1];
        for (int i = 0; i < len; i++) {
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);
            if (i - k + 1 >= 0) {
                result[index++] = nums[deque.peek()];
            }
        }
        return result;
    }
}