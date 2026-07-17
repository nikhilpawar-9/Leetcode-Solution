class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int s = flowerbed.length;
        int count = 0;
        for (int i = 0; i < s; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0 || flowerbed[i - 1] == 0);
                boolean emptyRight = (i == s - 1 || flowerbed[i + 1] == 0);

                if (emptyLeft && emptyRight) {
                    count++;
                    flowerbed[i] = 1;
                }
            }

        }
        return count >= n;
    }
}