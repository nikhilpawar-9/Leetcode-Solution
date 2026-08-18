class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if(k == n){
            int max = -1;
            for(int num : nums) max = Math.max(max, num);
            return max;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

        if(k == 1){
            int max = -1;
            for(int num : nums){
                int count = map.get(num);
                if(count == 1) max = Math.max(max, num);
            }
            return max; 
        }  
        int f = nums[0];
        int l = nums[n - 1];
        int ans = -1;
        if(map.get(f) == 1) ans = Math.max(ans, f);
        if(map.get(l) == 1) ans = Math.max(ans, l);
        return ans;
    }
}