class Solution {
    public int longestSubsequence(int[] nums) {
        int total = 0;
        boolean flag = false;
        for(int num : nums){
            total ^= num;
            if(num != 0){
                flag = true;
            }
        }
        if(total != 0) return nums.length;
        return flag ? nums.length - 1 : 0;
    }
}