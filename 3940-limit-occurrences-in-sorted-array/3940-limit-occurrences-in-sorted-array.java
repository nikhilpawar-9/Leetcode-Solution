class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            int num = nums[i];
            if(i != 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i; j < nums.length; j++){
                if(nums[i] == nums[j]) count++;
                if(count <= k && nums[j] == num) list.add(nums[j]);
                if(count > k) break;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}