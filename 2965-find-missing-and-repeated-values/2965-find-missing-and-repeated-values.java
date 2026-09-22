class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        // Arrays.sort(grid);
        for(int row[] : grid){
            for(int num : row){
                if(set.contains(num)) list.add(num);
                else set.add(num);
            }
        }
        int n = grid.length * grid.length;
        for(int i = 1; i <= n; i++){
            if(!set.contains(i)){
                list.add(i);
                break;
            } 
        }
        int i = 0;
        int arr[] = new int[list.size()];
        for(int num : list){
            arr[i++] = num;
        }
        return arr;
    }
}