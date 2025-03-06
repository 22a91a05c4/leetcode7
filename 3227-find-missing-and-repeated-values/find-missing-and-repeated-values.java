class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(hm.containsKey(grid[i][j]))
                {
                    hm.put(grid[i][j],hm.get(grid[i][j])+1);
                }
                else
                {
                    hm.put(grid[i][j],1);
                }
            }
        }
        for(Map.Entry<Integer,Integer> i : hm.entrySet())
        {
            if(i.getValue()==2)
            {
                arr[0]=i.getKey();
                break;
            }
        }
        for(int i=1;i<=(grid.length*grid.length);i++)
        {
            if(!hm.containsKey(i))
            {
                arr[1]=i;
            }
        }
        return arr;
    }
}