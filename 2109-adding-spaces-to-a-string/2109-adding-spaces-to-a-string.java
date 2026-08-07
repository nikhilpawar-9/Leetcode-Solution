class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            if(j < spaces.length && i == spaces[j]){
                sb.insert(i + j, " ");
                j++;
            }
        }
        return sb.toString();
    }
}