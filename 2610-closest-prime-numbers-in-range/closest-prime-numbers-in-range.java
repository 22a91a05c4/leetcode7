class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] arr = new int[2];
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=left;i<=right;i++)
        {
            if(isprime(i))
            {
                al.add(i);
            }
        }
        if(al.size()<=1)
        {
            arr[0]=-1;
            arr[1]=-1;
        }
        else
        {
            int a,b;
            int min=al.get(1)-al.get(0);
            a=al.get(0);
            b=al.get(1);
            for(int i=1;i<al.size()-1;i++)
            {
                int diff = (al.get(i+1)-al.get(i));
                if(diff<min)
                {
                    min=diff;
                    a=al.get(i);
                    b=al.get(i+1);
                }
            }
            arr[0]=a;
            arr[1]=b;
        }
        return arr;
    }
    boolean isprime(int n)
    {
        if(n<2) return false;
        if(n==2)   return true;
        if(n%2==0)  return false;
        for(int i=3;i*i<=n;i+=2)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}