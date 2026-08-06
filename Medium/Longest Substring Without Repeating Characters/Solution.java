int ans=0;
        // List<Integer> hash=new ArrayList<>();
        // Arrays.fill(hash, -1);
        int[] hash=new int[256];
        Arrays.fill(hash, -1);
        while(r<s.length())
        {
            if(hash[s.charAt(r)]!=-1)
            {
                l=Math.max(l, hash[s.charAt(r)]+1);
            }
            hash[s.charAt(r)]=r;