class Solution {
    public int secondHighest(String s) {
        Set<Integer> set = new HashSet<>();
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                set.add(c - '0');
            }
        }
        int max1 = -1, max2 = -1;
        for(int num : set){
            if(num > max1){
                max1 = max2;
                max2 = num;
            }
            else if(num > max2){
                max2 = num;
            }
        }
        return max1;
    }
}