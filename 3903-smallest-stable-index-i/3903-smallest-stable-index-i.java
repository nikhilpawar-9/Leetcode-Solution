class Solution {
    public int firstStableIndex(int[] nums, int c) {
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int max = 0;
            int min = Integer.MAX_VALUE;
            for(int j = 0; j <= i; j++){
                max = Math.max(max, nums[j]);
            }
            for(int k = i; k < nums.length; k++){
                min = Math.min(min, nums[k]);
            }
            if(max - min <= c) ans = Math.min(ans, i);
        }
        if(ans == Integer.MAX_VALUE) return -1;
        else return ans;
    }
}