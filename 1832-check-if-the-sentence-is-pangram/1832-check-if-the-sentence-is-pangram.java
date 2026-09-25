class Solution {
    public boolean checkIfPangram(String s) {
        boolean check[] = new boolean[26];
        for(char c : s.toCharArray()){
            check[c - 'a'] = true;
        }
        for(boolean c : check){
            if(!c) return false;
        }
        return true;
    }
}