int r=0;
        int ans=0;
        List<Integer> hash=new int[256];
        Arrays.fill(arr, -1);
        while(r<s.length())
        {
            if(hash[s[r]]!=-1)
            {
                l=Math.max(l, h[s[0]]+1);
            }
            
        }