class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character,Integer> hm1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> hm2 = new HashMap<Character,Integer>();
        int s=0;
        int tot=0;
        for(int i=0;i<word1.length();i++)
        {
            char ch = word1.charAt(i);
            if(hm1.containsKey(ch))
            {
                hm1.put(ch,hm1.get(ch)+1);
            }
            else
            {
                hm1.put(ch,1);
            }
        }
        for(int i=0;i<word2.length();i++)
        {
            char ch = word2.charAt(i);
            if(hm2.containsKey(ch))
            {
                hm2.put(ch,hm2.get(ch)+1);
            }
            else
            {
                hm2.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> i : hm1.entrySet())
        {
            if(hm2.containsKey(i.getKey()))
            {
                int vl=Math.abs(hm1.get(i.getKey())-hm2.get(i.getKey()));
                tot++;
                if(vl<=3)   s++;
            }
            else
            {
                int vl=hm1.get(i.getKey());
                tot++;
                if(vl<=3)   s++;
            }
        }
        for(Map.Entry<Character,Integer> i : hm2.entrySet())
        {
            if(!hm1.containsKey(i.getKey()))
            {
                int vl=hm2.get(i.getKey());
                tot++;
                if(vl<=3)   s++;
            }
        }
        if(s==tot){
            return true;
        }
        else
        {
            return false;
        }
    }
}