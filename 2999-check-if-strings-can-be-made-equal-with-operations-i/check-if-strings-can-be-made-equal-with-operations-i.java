class Solution {
    public boolean canBeEqual(String s1, String s2) {
        int cnt = 0;

        // Check positions 0 and 2
        if ((s1.charAt(0) == s2.charAt(0) && s1.charAt(2) == s2.charAt(2)) ||
            (s1.charAt(0) == s2.charAt(2) && s1.charAt(2) == s2.charAt(0))) {
            cnt++;
        }

        // Check positions 1 and 3
        if ((s1.charAt(1) == s2.charAt(1) && s1.charAt(3) == s2.charAt(3)) ||
            (s1.charAt(1) == s2.charAt(3) && s1.charAt(3) == s2.charAt(1))) {
            cnt++;
        }

        return cnt == 2;
    }
}