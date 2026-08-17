class Solution {
    // int solve(int idx, int[] nums, int[] dp)
    // {
    //     if(idx>=nums.length) return 0;
    //     // if(dp[idx]!=-1) return dp[idx];
    //     int np=solve(idx+1, nums, dp);
    //     int p=solve(idx+2, nums, dp)+nums[idx];
    //      dp[idx]=Math.max(np, p);
    //     return dp[idx];
    // }
    public int rob(int[] nums) {
        int n=nums.length;
        int idx=0;
        int[] dp=new int[n];
        // Arrays.fill(dp, -1);
        dp[0]=nums[0];
        // return solve(idx, nums, dp);
        for(idx=1; idx<nums.length; idx++)
        {
        int np=dp[idx-1]+nums[idx-1];
        int p=dp[idx]+nums[idx];