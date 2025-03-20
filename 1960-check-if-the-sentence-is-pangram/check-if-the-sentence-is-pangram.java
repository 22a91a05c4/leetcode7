class Solution {
    public boolean checkIfPangram(String sentence) {
        /*HashSet<Character> hs = new HashSet<>();
        for(char ch : sentence.toCharArray())
        {
            hs.add(ch);
        }
        return hs.size()==26;*/
        if(sentence.length()<26)    return false;
        for(char ch='a';ch<='z';ch++)
        {
            if(sentence.indexOf(ch)<0)  return false;
        }
        return true;
    }
}