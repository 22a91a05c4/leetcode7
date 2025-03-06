class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i : nums1)
        {
            al.add(i);
        }
        for(int i : nums2)
        {
            al.add(i);
        }
        int l=al.size();
        Collections.sort(al);
        if(l%2!=0)
        {
            return al.get(l/2);
        }
        else
        {
            int e=(l/2);
            double adding = al.get(e)+al.get(e-1);
            return adding/2;
        }
    }
}