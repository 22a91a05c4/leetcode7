class Solution {
    public int vowelStrings(String[] words, int left, int right) {
       int c=0;
       for(int i=left;i<=right;i++)
       {
            int len = words[i].length();
            if("aeiou".contains(Character.toString(words[i].charAt(0))) && "aeiou".contains(Character.toString(words[i].charAt(len-1))))
            {
                c++;
            }
       } 
       return c;
    }
}