class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if (i % 2 == 1) { 
                ch = shift(s.charAt(i - 1), s.charAt(i) - '0');
            }
            sb.append(ch);
        }
        return sb.toString();
    }
    char shift(char ch, int val)
    {
        int g =( (int) ch) + val;
        char b = (char) g;
        return b;
    }
}