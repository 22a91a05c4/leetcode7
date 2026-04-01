class Solution {
    public boolean checkStrings(String s1, String s2) {
        int c=0;
        List<Character> hs1e = new ArrayList<Character>();
        List<Character> hs1o = new ArrayList<Character>();
        List<Character> hs2e = new ArrayList<Character>();
        List<Character> hs2o = new ArrayList<Character>();
        for(int i=0;i<s1.length();i++)
        {
            if(i%2==0)
            {
                hs1e.add(s1.charAt(i));
                hs2e.add(s2.charAt(i));
            }
            else
            {
                hs1o.add(s1.charAt(i));
                hs2o.add(s2.charAt(i));
            }
        }
        Collections.sort(hs1e);
        Collections.sort(hs2e);
        Collections.sort(hs1o);
        Collections.sort(hs2o);
        int ce=0;
        int co=0;
        for(int i=0;i<hs1e.size();i++)
        {
            if(hs1e.get(i)==hs2e.get(i))
            {
                ce++;
            }
        }
        for(int i=0;i<hs1o.size();i++)
        {
            if(hs1o.get(i)==hs2o.get(i))
            {
                co++;
            }
        }
        if(ce==hs1e.size() && co==hs1o.size())
        {
            return true;
        }
        else
        {
            return false;
        }
        // return hs1e.equals(hs2e) && hs1o.equals(hs2o);
    }
}