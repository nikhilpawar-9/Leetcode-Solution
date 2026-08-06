class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        return key;
    }
}