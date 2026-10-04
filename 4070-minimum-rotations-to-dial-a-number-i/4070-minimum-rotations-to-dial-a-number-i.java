class Solution {
    public int minRotations(String s) {
        int ans = 0, curr = 0;
        for(char c : s.toCharArray()){
            int n = c - '0';
            int d = Math.abs(n - curr);
            ans += Math.min(d, 10 - d);
            curr = n;
        }
        return ans;
    }
}