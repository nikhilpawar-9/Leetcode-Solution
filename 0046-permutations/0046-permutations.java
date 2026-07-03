class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        find(new ArrayList<>(), nums, list);
        return list;
    }
    public static void find(List<Integer> list, int nums[], List<List<Integer>> l){

        if(list.size() == nums.length){
            l.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                find(list, nums, l);
                list.remove(list.size() - 1);
            }
        }
    }
}