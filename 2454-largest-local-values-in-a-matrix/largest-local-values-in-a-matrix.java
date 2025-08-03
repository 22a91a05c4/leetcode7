class Solution {
    public int[][] largestLocal(int[][] grid) {
        // int glen=grid.length;
        // int[][] arr = new int[glen-2][glen-2];
        // for(int i=0;i<glen-2;i++)
        // {
        //     for(int j=0;j<glen-2;j++)
        //     {
        //         int max=0;
        //         for(int b=i;b<j+3;b++)
        //         {
        //             for(int p=j;p<j+3;p++)
        //             {
        //                 max=Math.max(max,grid[b][p]);
        //             }
        //         }
        //         arr[i][j]=max;
        //     }
        // }
        // return arr;
        int n = grid.length;
        int[][] ans = new int[n-2][n-2];
        for(int i=0;i<n-2;i++)
        {
            for(int j=0;j<n-2;j++)
            {
                int maxi=getgridmax(grid,i,j);
                ans[i][j]=maxi;
            }
        }
        return ans;
    }
    int getgridmax(int[][] grid,int row, int col)
        {
            int maxval=0;
            for(int i=row;i<row+3;i++)
            {
                for(int j=col;j<col+3;j++)
                {
                    maxval = Math.max(maxval, grid[i][j]);
                }
            }
            return maxval;
        }
}