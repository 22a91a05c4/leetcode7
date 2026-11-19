class Solution {
    public int[] concatWithReverse(int[] nums) {
        int k=nums.length;
        int ans[] = new int[k*2];
        int i=0;
        int j=(k*2)-1;
        int temp = k;
        while (k!=0)
        {
            ans[i] = nums[i];
            ans[j] = nums[temp-k];
            k--;
            i++;
            j--;
        }
        return ans;
    }
}