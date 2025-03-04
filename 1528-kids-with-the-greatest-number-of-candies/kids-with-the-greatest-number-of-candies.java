class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> al = new ArrayList<Boolean>();
        int[] arr = new int[candies.length];
        for(int i=0;i<candies.length;i++)
        {
            arr[i]=candies[i];
        }
        Arrays.sort(candies);
        int maxele=candies[(arr.length)-1];
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]+extraCandies)>=maxele)
            {
                al.add(true);
            }
            else
            {
                al.add(false);
            }
        }
        return al;
    }
}