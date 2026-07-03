class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    makeZero(grid, i, j);
                }
            }
        }
        return count;
    }
    public static void makeZero(char grid[][], int r, int c){
        if(r >= grid.length || c >= grid[0].length || r < 0 || c < 0 || grid[r][c] == '0') return;

        grid[r][c] = '0';
        // up
        makeZero(grid, r - 1, c);
        // down
        makeZero(grid, r + 1, c);
        // left
        makeZero(grid, r, c - 1);
        // right
        makeZero(grid, r, c + 1);
    }
}