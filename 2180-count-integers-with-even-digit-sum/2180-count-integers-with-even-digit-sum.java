class Solution {
    public int countEven(int n) {
        int c = 0;
        for(int i = 1; i <= n; i++){
            int sum = 0;
            int num = i;
            while(num != 0){
                int d = num % 10;
                sum += d;
                num /= 10;
            }
            if(sum % 2 == 0) c++;
        }
        return c;
    }
}