class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> hm1 = new HashMap<String,Integer>();
        HashMap<String,Integer> hm2 = new HashMap<String,Integer>();
        ArrayList<String> st = new ArrayList<>();
        for(String s : s1.split(" "))
        {
            if(hm1.containsKey(s))
            {
                hm1.put(s,hm1.get(s)+1);
            }
            else
            {
                hm1.put(s,1);
            }
        }
        for(String s : s2.split(" "))
        {
            if(hm2.containsKey(s))
            {
                hm2.put(s,hm2.get(s)+1);
            }
            else
            {
                hm2.put(s,1);
            }
        }
        for(Map.Entry<String,Integer> i : hm1.entrySet())
        {
            if(i.getValue()==1 && !hm2.containsKey(i.getKey()))
            {
                st.add(i.getKey());
            }
        }
        for(Map.Entry<String,Integer> i : hm2.entrySet())
        {
            if(i.getValue()==1 && !hm1.containsKey(i.getKey()))
            {
                st.add(i.getKey());
            }
        }
        String[] ans = new String[st.size()];
        int k=0;
        for(String i : st)
        {
            ans[k]=i;
            k++;
        }
        return ans;
    }
}