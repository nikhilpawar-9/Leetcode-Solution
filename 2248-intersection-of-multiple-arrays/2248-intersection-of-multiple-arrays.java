class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int row[] : nums){
            for(int num : row){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int num : map.keySet()){
            if(map.get(num) == nums.length) list.add(num);
        }
        Collections.sort(list);
        return list;
    }
}