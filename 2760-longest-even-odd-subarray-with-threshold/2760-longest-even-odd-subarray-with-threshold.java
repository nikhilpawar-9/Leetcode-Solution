class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int max = 0;
        for(int k = 0; k < nums.length; k++){
            if(nums[k] % 2 != 0 || nums[k] > threshold) continue;
            int curr = 1;
            int i = k;
            int j = i + 1;
            while(j < nums.length){
                if(nums[i] % 2 != nums[j] % 2 && nums[j] <= threshold){
                    curr++;
                    i++;
                    j++;
                } else{
                    break;
                } 
            }
            max = Math.max(curr, max);
        }
        return max;
    }
}