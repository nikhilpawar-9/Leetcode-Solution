class Solution {
    public int absDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        if(k == 1 && nums.length == 2) return nums[1] - nums[0];
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < k; i++){
            sum1 += nums[i];
        }
        int i = n - 1;
        while(k != 0){
            sum2 += nums[i];
            k--;
            i--;
        }
        return sum2 - sum1;
    }
}