class Solution {
    public int sumBase(int n, int k) {
        int ans = 0;
        while(n > 0){
            int rem = n % k;
            if(n < k){
                ans += n;
            } 
            else{
                ans += rem;
            } 
            n = n / k;
        }
        return ans;
    }
}