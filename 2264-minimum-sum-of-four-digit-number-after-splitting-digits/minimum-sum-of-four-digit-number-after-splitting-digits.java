class Solution {
    public int minimumSum(int num) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int q;
        while(num!=0)
        {
            q=num%10;
            al.add(q);
            num=num/10;
        } 
        Collections.sort(al);
        String ss = "" + (char) ('0' + al.get(0)) + (char) ('0' + al.get(2));
        String sn = "" + (char) ('0' + al.get(1)) + (char) ('0' + al.get(3));
        int ans = Integer.parseInt(ss) + Integer.parseInt(sn);
        return ans;
    }
}