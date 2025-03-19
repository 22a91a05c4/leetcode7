class Solution {
    public String reversePrefix(String word, char ch) {
        //Stack<Character> st = new Stack<>();
        int ind = word.indexOf(ch);
        if(ind==-1) return word;
        String part1 = word.substring(0, ind+1);
        String part2 = word.substring(ind+1);
        String rev1=new StringBuilder(part1).reverse().toString();
        String ans = rev1+part2;
        return ans;
    }
}