class Solution {
    public int maximum69Number (int num) {
        String str = Integer.toString(num);
        String ans = str.replaceFirst("6","9");
        return Integer.parseInt(ans);
    }
}