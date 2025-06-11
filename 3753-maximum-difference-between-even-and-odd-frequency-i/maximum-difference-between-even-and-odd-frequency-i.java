class Solution {
    public int maxDifference(String s) {
        HashSet<Integer> odd = new HashSet<Integer>();
        HashSet<Integer> even = new HashSet<Integer>();
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(char ch : s.toCharArray())
        {
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
            else
            {
                hm.put(ch,1);
            }
        }
        //System.out.println(hm);
        for(Map.Entry<Character,Integer> i : hm.entrySet())
        {
            if(i.getValue()%2==0)
            {
                even.add(i.getValue());
            }
            else
            {
                odd.add(i.getValue());
            }
        }
        if (odd.isEmpty() || even.isEmpty()) {
            return 0;
        }
        int maxf=Collections.max(odd);
        int minf=Collections.min(even);
        //System.out.println(maxf+" "+minf);
        return (maxf-minf);
    }
}