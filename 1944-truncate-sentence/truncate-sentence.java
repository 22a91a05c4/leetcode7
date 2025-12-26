class Solution {
    public String truncateSentence(String s, int k) {
        String[] wa =s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<k;i++)
        {
            if(i>0)
            {
                sb.append(" ");
            }
            sb.append(wa[i]);
        }
        return sb.toString();
    }
}