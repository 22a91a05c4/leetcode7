class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int n=(int) Math.log10(nums[i])+1;
            if(n==1)
            {
                al.add(nums[i]);
            }
            else
            {
                int[] arr = new int[n];
                int temp = nums[i];
                int r;
                int k=0;
                while(temp!=0)
                {
                    r=temp%10;
                    arr[k]=r;
                    k++;
                    temp=temp/10;
                }
                for(int j=(n-1);j>=0;j--)
                {
                    al.add(arr[j]);
                }
            }
        }
        int[] ans = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }
        return ans;
    }
}