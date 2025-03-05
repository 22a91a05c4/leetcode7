class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=1;
        for(int i=0;i<sentences.length;i++)
        {
            String[] st=sentences[i].split(" ");
            int num=st.length;
            if(num>=max)
            {
                max=num;
            }
        }
        return max;
    }
}