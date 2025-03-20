class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> hs = new HashSet<Character>();
        for(char ch : s.toCharArray())
        {
            hs.add(ch);
        }
        return hs.size();
    }
}