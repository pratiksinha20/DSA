{
        Arrays.fill(hash, -1);
        while(r<s.length())
            if(hash[s.charAt(r)]!=-1)
            {
                l=Math.max(l, h[s.charAt(0)]+1);
        int[] hash=new int[256];
        // Arrays.fill(hash, -1);
        // List<Integer> hash=new ArrayList<>();
        int ans=0;
        int r=0;
        int l=0;