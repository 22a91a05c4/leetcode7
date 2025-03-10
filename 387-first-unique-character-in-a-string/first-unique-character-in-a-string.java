class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
        int ans=-1;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
            else
            {
                hm.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> i : hm.entrySet())
        {
            if(i.getValue()==1)
            {
                char f=i.getKey();
                ans = s.indexOf(f);
                break;
            }
        }
        return ans;
    }
}