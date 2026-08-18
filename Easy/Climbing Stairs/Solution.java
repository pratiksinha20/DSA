//     return mp.get(n);
        // }
        // int res=climbStairs(n-1)+climbStairs(n-2);
        // mp.put(n,res);
        // return res;
        if(n<=3) return n;

        int[] dp= new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        // dp[3]=3;
        for(int i=3; i<=n; i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}