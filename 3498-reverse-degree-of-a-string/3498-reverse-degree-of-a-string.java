class Solution {
    public int reverseDegree(String s) {
        int i = 1;
        int sum = 0;
        for(char c : s.toCharArray()){
            int pos = 26 - (c - 'a');
            sum += pos * i;
            i++;
        }
        return sum;
    }
}