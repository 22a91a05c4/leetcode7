class Solution {
    public String destCity(List<List<String>> paths) {
        String s = new String();
        HashSet<String> hs = new HashSet<>();
        /*for(int i=0;i<paths.size();i++)
        {
            for(int j=0;j<2;j++)
            {
                if(!hs.contains(paths.get(i).get(j)))
                {
                    hs.add(paths.get(i).get(j));
                    s=paths.get(i).get(j);
                }
                /*if(!hs.contains(paths.get(i).get(j)) && j==1)
                {
                    s=paths.get(i).get(j);
                }
            }
        }*/
        for(List<String> i : paths)
        {
            hs.add(i.get(0));
        }
        for(List<String> i : paths)
        {
            if(!hs.contains(i.get(1)))  s=i.get(1);
        }
        return s;
    }
}