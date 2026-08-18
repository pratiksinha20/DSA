// Arrays.fill(dp, -1);
        dp[0]=nums[0];
        // return solve(idx, nums, dp);
        for(idx=1; idx<nums.length; idx++)
        {
        int np=dp[idx-1]+nums[idx-1];
        int p=dp[idx]+nums[idx];
        int[] dp=new int[n];
        int idx=0;
        int n=nums.length;
    public int rob(int[] nums) {
    // }
    //     return dp[idx];
    //      dp[idx]=Math.max(np, p);
    //     int p=solve(idx+2, nums, dp)+nums[idx];
    //     int np=solve(idx+1, nums, dp);
    //     // if(dp[idx]!=-1) return dp[idx];
    //     if(idx>=nums.length) return 0;
    // {
    // int solve(int idx, int[] nums, int[] dp)
class Solution {