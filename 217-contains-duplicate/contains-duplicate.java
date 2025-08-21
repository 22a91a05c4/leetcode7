//   option-1
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         int n=nums.length;
//         for (int i = 0; i < n - 1; i++) {
//             if(nums[i]==nums[i+1])
//             {
//                 return true;
//             }
//         }
//         return false;
//     }
// }

//    option-2
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i : nums)
        {
            hs.add(i);
        }
        if(nums.length!=hs.size())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}