class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(char ch : text.toCharArray())
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
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(Map.Entry<Character,Integer> i : hm.entrySet())
        {
            if(i.getKey()=='b' || i.getKey()=='a' || i.getKey()=='n')
            {
                al.add(i.getValue());
            }
            else if(i.getKey()=='l' || i.getKey()=='o')
            {
                al.add((i.getValue())/2);
            }
        }
        if(al.size()==5) return Collections.min(al);
        else    return 0;
    }
}