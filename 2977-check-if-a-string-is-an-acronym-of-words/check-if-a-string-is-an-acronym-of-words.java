class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length())  return false;
        String st = new String();
        for(String i : words)
        {
            st=st+i.charAt(0);
        }
        return st.equals(s);
    }
}