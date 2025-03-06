class Solution {
    public boolean winnerOfGame(String colors) {
        int a=0,b=0;
        for(int i=1;i<colors.length()-1;i++)
        {
            char c1=colors.charAt(i-1);
            char c2=colors.charAt(i);
            char c3=colors.charAt(i+1);
            if(c1=='A' && c2=='A' && c3=='A')
            {
                a++;
            }
            else if(c1=='B' && c2=='B' && c3=='B')
            {
                b++;
            }
        }
        if(a>b)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}