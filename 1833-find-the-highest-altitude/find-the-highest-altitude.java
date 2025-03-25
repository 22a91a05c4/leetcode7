class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(0);
        for(int i=0;i<gain.length;i++)
        {
            int sum=gain[i]+al.get(al.size()-1);
            al.add(sum);
        }
        return Collections.max(al);
    }
}