class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n - 2; i++){
            int tar = nums[i] * -1;
            int l = i + 1;
            int r = n - 1;
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            while(l < r){
                int sum = nums[l] + nums[r];
                if(sum == tar){
                    list.add(Arrays.asList(nums[i], nums[l++], nums[r--]));

                    while(l < r && nums[l] == nums[l - 1]) l++; 
                }
                else if(sum > tar) r--;
                else l++;
            }
        }
        return list;
    }
}