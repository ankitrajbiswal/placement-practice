class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
       int n=s.length();
        int tot=(int)Math.pow(2,n);//total subsequence of 'n' characters is '2^n'
        List<String> ans=new ArrayList<>();
        
        for(int i=0;i<tot;i++)
        {
            String ns="";
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j)) != 0)
                    ns+=s.charAt(j);
            }
            if(ns.length()>0)
            ans.add(ns);
        }
        Collections.sort(ans);
        return ans;

    
    }
}
