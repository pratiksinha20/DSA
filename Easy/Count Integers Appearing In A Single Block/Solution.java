1class Solution {
public int countSpecialIntegers(int[] nums) {
int n=nums.length;
// int count=0;
// for(int i=0; i<n; i++)
//     {
//         for(int j=i+1; j<n; j++)
//             {
//                 if(nums[i]==nums[j])
//                 {
//                 }
//             }
//     }
int[] com= new int[110];
int pre=-1;
for(int i: nums)
{
if(com[i]==0)
{
com[i]=1;
}
else if(i !=pre)
{
com[i]=-1;
}
pre=i;
}
int ans=0;
for(int j=1; j<=100; j++)
{
if(com[j]==1)
{
ans++;
}
}
return ans;
}
40}