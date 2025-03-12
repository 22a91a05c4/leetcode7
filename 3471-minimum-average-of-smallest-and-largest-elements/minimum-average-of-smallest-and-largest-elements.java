class Solution {
    public double minimumAverage(int[] nums) {
        ArrayList<Double> al = new ArrayList<Double>();
        Arrays.sort(nums);
        for(int i=0;i<(nums.length)/2;i++)
        {
            int mi=nums[i];
            int ma=nums[nums.length-i-1];
            double avg= (mi+ma)/2.0;
            al.add(avg);
        }
        return Collections.min(al);
    }
}