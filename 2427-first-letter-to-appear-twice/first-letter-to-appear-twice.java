class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> hs = new HashSet<Character>();
        char[] ch = new char[1];
        for(int i=0;i<s.length();i++)
        {
            if(hs.contains(s.charAt(i)))
            {
                ch[0]=s.charAt(i);
                break;
            }
            else
            {
                hs.add(s.charAt(i));
            }
        }
        return ch[0];
    }
}