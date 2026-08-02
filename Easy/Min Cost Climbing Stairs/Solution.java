class Solution {
    int solve(int idx, int[] cost, int mn)
    {
        if(cost.length<2)
        {
            if(cost[0]>cost[1]) return cost[1];
            else
            {
                return cost[0];
            }
        }
        if((cost[idx]+cost[idx+1])>(cost[idx]+cost[idx+2]))
        {
            return mn=cost[idx]+cost[idx+2];
        }
        else