class Solution {
    public boolean isSameAfterReversals(int num) {
        int l =(Integer.toString(num)).length();
        if(l==1)
        {
            return true;
        }
        else
        {
            int r=num%10;
            if(r==0)
            {
                return false;
            }
            return true;
        }
    }
}