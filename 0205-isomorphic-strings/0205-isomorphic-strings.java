class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if (!map1.containsKey(s.charAt(i))) {
                map1.put(s.charAt(i), i); 
            }
            if (!map2.containsKey(t.charAt(i))) {
                map2.put(t.charAt(i), i); 
            }
        }
        for(int i = 0; i < s.length(); i++){
            char m1 = s.charAt(i);
            char m2 = t.charAt(i);
            if(!map1.get(m1).equals(map2.get(m2))) return false;
        }
        return true;
    }
}