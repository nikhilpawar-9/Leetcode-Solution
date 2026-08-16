class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int a = -1;
        int max = Integer.MAX_VALUE;
        for(int i = 0; i < drones.length; i++){
            int range = drones[i][2];
            int sum = 0;
            for(int j = 0; j < 2; j++){
                sum += Math.abs(drones[i][j] - target[j]);
            }
            if(sum < max && sum <= range){
                a = i;
                max = sum;
            }
        }
        return a;
    }
}