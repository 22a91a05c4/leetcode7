class Solution {
    public boolean isStrictlyPalindromic(int n) {
        /*int c=0;
        int ans=0;
        for (int i = 2; i <= n - 2; i++) {
            int temp = n;
            StringBuilder sb = new StringBuilder();
            while (temp > 0) {
                sb.append(temp % i);
                temp = temp / i;
            }
            if (sb.toString().equals(sb.reverse().toString())) {
                c++;
            }
        }

        return c == (n - 2);*/
        return false;
    }
}