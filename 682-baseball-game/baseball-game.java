class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
        Stack<Integer> st = new Stack<>();
        for(String i : operations)
        {
            if("CD+".indexOf(i)==-1)
            {
                st.push(Integer.parseInt(i));
            }
            else
            {
                if(i.equals("C"))  st.pop();
                if(i.equals("D"))  st.push(2*st.peek());
                if(i.equals("+"))  st.push(st.peek()+st.get(st.size()-2));
            }
        }
        System.out.println(st);
        for(int i : st)
        {
            sum+=i;
        }
        return sum;
    }
}