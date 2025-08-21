class Solution {
    public boolean isAnagram(String s, String t) {
        TreeMap<Character, Integer> tm1 = new TreeMap<Character, Integer>();
        TreeMap<Character, Integer> tm2 = new TreeMap<Character, Integer>();
        if(s.length()!=t.length())  return false;
        for(int i=0;i<t.length();i++)
        {
            char ch = t.charAt(i);
            if(tm1.containsKey(ch))
            {
                tm1.put(ch,tm1.get(ch)+1);
            }
            else
            {
                tm1.put(ch,1);
            }
        }
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(tm2.containsKey(ch))
            {
                tm2.put(ch,tm2.get(ch)+1);
            }
            else
            {
                tm2.put(ch,1);
            }
        }
        // for(Map.Entry<Character,Integer> i : tm1.entrySet())
        // {
        //     char ch = i.getKey();
        //     if(i.getValue()!=tm2.get(ch))
        //     {
        //         return false;
        //     }
        // } //wrong
        return tm1.equals(tm2);
    }
}
