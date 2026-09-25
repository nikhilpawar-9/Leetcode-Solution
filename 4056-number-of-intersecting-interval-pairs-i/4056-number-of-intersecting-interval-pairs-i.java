class Solution {
    public int countIntersectingIntervals(int[][] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int max = Math.max(nums[i][0], nums[j][0]);
                int min = Math.min(nums[i][1], nums[j][1]);

                if (max <= min) count++;
            }
        }
        return count;
    }
}