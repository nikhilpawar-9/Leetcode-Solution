class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

        int max = Collections.max(map.values());
        int ans = 0;
        for(int num : map.keySet()){
            if(map.get(num) == max) ans += map.get(num);
        }
        return ans;
    }
}