class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n];
        ans[n - 1] = nums[n - 1];
        for(int i = n - 2; i > -1; i--){
            ans[i] = Math.min(ans[i + 1], nums[i]);
        }
        int max = nums[0];
        for(int i = 0; i < n; i++){
            max = Math.max(max, nums[i]);
            if(max - ans[i] <= k) return i;
        }
        return -1;
    }
}