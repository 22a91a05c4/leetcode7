class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if("1234567890".indexOf(ch)!=-1)
            {
                st.pop();
            }
            else
            {
                st.push(ch);
            }
        }
        String ans = new String();
        for(char i : st)
        {
            ans=ans+i;
        }
        return ans;
    }
}