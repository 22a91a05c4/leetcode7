class Solution {
    public String interpret(String command) {
        String st ="";
        int i=0;
        while(i<command.length())
        {
            if(command.charAt(i)=='G')
            {
                st=st+"G";
                i++;
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')')
            {
                st=st+"o";
                i=i+2;
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)=='a' && command.charAt(i+2)=='l' && command.charAt(i+3)==')')
            {
                st=st+"al";
                i=i+4;
            }
        }
        return st;
    }
}