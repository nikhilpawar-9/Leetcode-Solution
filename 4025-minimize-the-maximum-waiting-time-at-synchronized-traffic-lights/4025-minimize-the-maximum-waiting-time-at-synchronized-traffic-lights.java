class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int maxLight = 0;
        for(int light : lights) maxLight = Math.max(light, maxLight);

        int max = 0;
        for(int i = 0; i < arrivalTime.length; i++){
            int r = arrivalTime[i] % period;
            if(r < maxLight){
                max = Math.max(max, 0);
            }
            else{
                max = Math.max(max, period - r);
            }
        }
        return max;
    }
}