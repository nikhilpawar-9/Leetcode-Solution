class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        int c = 0;
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
        }
        int len = 0;
        boolean odd = false;
        for(int val : map.values()){
            if(val % 2 == 0) len += val;
            else{
                len += val - 1;
                odd = true;
            }
        }
        if(odd) len += 1;
        return len;
    }
}