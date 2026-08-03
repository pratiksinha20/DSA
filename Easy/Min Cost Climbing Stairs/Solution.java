{
            return mn=cost[idx]+cost[idx+2];
        }
        else
        {
            return mn=cost[idx]+cost[idx+1];
        }
    }


    public int minCostClimbingStairs(int[] cost) {
        int idx=0;
        int mn=Integer.MAX_VALUE;
        return solve(idx, cost, mn);
        
    }
}