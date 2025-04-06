class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(String st : word1)
        {
            s1.append(st);
        }
        for(String st : word2)
        {
            s2.append(st);
        }
        String g1 = s1.toString();
        String g2 = s2.toString();
        return g1.equals(g2);
    }
}