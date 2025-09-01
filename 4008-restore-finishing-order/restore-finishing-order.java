class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int k=0;
        int[] arr = new int[friends.length];
        List<Integer> al = new ArrayList<Integer>();
        for(int i : friends)
        {
            al.add(i);
        }
        for(int i : order)
        {
            if(al.contains(i))
            {
                arr[k++]=i;
            }
        }
        return arr;
    }
}