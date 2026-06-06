class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int leftArr[] = new int[n];
        int rightArr[] = new int[n];
        leftArr[0] = 0;
        rightArr[n - 1] = 0;

        for(int i = 0; i < n - 1; i++){
            leftArr[i + 1] = leftArr[i] + nums[i]; 
        }

        for(int i = n - 2; i >= 0; i--){
            rightArr[i] = rightArr[i + 1] + nums[i + 1];
        } 

        for(int i = 0; i < n; i++){
            nums[i] = Math.abs(leftArr[i] - rightArr[i]);
        }

        return nums;
    }
}