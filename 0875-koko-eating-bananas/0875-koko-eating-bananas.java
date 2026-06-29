class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for(int pile : piles) right = Math.max(pile, right);

        while(left < right){
            int mid = left + (right - left) / 2;
            if(kelaa(piles, h, mid)) right = mid;
            else left = mid + 1;
        }
        return left;
    }
    static boolean kelaa(int piles[], int h, int mid){
        long hr = 0;
        for(int pile : piles) hr += (pile + mid - 1) / mid;
        return hr <= h;
    }
}