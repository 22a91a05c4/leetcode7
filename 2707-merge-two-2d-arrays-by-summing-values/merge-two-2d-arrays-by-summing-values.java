class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums1.length;i++)
        {
            if(hm.containsKey(nums1[i][0]))
            {
                hm.put(nums1[i][0],hm.get(nums1[i][0])+nums1[i][1]);
            }
            else
            {
                hm.put(nums1[i][0],nums1[i][1]);
            }
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(hm.containsKey(nums2[i][0]))
            {
                hm.put(nums2[i][0],hm.get(nums2[i][0])+nums2[i][1]);
            }
            else
            {
                hm.put(nums2[i][0],nums2[i][1]);
            }
        }
        int[][] arr = new int[hm.size()][2];
        TreeMap<Integer,Integer> tm = new TreeMap<>(hm);
        int j=0;
        for(Map.Entry<Integer,Integer> i : tm.entrySet())
        {
            arr[j][0]=i.getKey();
            arr[j][1]=i.getValue();
            j++;
        }
        return arr;
    }
}