class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        ArrayList<Integer> samp  = new ArrayList<Integer>();
        for(int i=0;i<items1.length;i++)
        {
            if(!samp.contains(items1[i][0]))    samp.add(items1[i][0]);
            if(hm.containsKey(items1[i][0]))
            {
                hm.put(items1[i][0],hm.get(items1[i][0])+items1[i][1]);
            }
            else
            {
                hm.put(items1[i][0],items1[i][1]);
            }
        }
        for(int i=0;i<items2.length;i++)
        {
            if(!samp.contains(items2[i][0]))    samp.add(items2[i][0]);
            if(hm.containsKey(items2[i][0]))
            {
                hm.put(items2[i][0],hm.get(items2[i][0])+items2[i][1]);
            }
            else
            {
                hm.put(items2[i][0],items2[i][1]);
            }
        }
        Collections.sort(samp);
        List<List<Integer>> al = new ArrayList<>();
        for(int i=0;i<samp.size();i++)
        {
            ArrayList<Integer> l1 = new ArrayList<Integer>();
            l1.add(samp.get(i));
            l1.add(hm.get(samp.get(i)));
            al.add(l1);
        }
        return al;
    }
}