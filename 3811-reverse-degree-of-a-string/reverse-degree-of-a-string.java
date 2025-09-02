class Solution {
    public int reverseDegree(String s) {
        int hash[] = new int[26];
        int sum=0;
        for(int i=0;i<26;i++){
            hash[i]=26-i;
        }
        for(int i=0;i<s.length();i++)
        {
            int ind=s.charAt(i)-'a';
            System.out.println(ind);
            sum=sum+(hash[ind]*(i+1));
        }
        return sum;
    }
}