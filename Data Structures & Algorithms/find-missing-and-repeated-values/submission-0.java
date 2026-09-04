class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeate = -1;
        int missing = -1;
        int n = grid.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < grid.length;i++){
            for(int j =0; j < grid.length;j++){
                if(!set.contains(grid[i][j])){
                    set.add(grid[i][j]);
                }else{
                    repeate = grid[i][j];
                }
            }
        }
        for(int  i = 1; i <= n*n;i++){
            if(!set.contains(i)){
                missing = i;
                break;
            }
        }
        return new int[]{repeate,missing};
    }
}