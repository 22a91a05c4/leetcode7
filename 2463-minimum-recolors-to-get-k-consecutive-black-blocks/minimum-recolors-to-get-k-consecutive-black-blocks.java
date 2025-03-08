class Solution {
    public int minimumRecolors(String blocks, int k) {
        //ArrayList<Integer> al = new ArrayList<Integer>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=blocks.length()-k;i++)
        {
            int s=0;
            for(int j=i;j<i+k;j++)
            {
                char ch1=blocks.charAt(j);
                if(ch1=='W')
                {
                    s++;
                }
            }
            //al.add(s);
            min=Math.min(s,min);
        }
        //Collections.sort(al);
        //int ans=al.get(0);
        //return ans;
        return min;
    }
}