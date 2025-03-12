class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int mine=0;
        for(int i=piles.length-2;i>=piles.length/3;i-=2)
        {
            mine=mine+piles[i];
        }
        return mine;
    }
}