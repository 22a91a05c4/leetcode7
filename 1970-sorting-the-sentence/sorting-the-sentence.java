class Solution {
    public String sortSentence(String s) {
        /*HashMap<Integer,String> hm = new HashMap<Integer,String>();
        String[] sar = s.split(" ");
        String[] ans = new String[sar.length];
        for(int i=0;i<sar.length;i++)
        {
            String st = sar[i];
            hm.put(st.charAt(st.length()-1)-'0',st.substring(0,st.length()-1));
        }
        for (int i = 1; i <= sar.length; i++) 
        {
            ans[i - 1] = hm.get(i);
        }
        return String.join(" ",ans);*/
        String words[]= s.split(" "); // split(" ") is a method in Java that splits a string into an array of substrings
        String[] sortedWords = new String[words.length]; // Array for sorted words
        // Extract index and store word in correct position
        for(String word:words)
        {
            int index = word.charAt(word.length()-1)-'0'; // Extract number from last character
            sortedWords[index-1]= word.substring(0, word.length()-1);
        }
       return String.join(" ", sortedWords);
    }
}