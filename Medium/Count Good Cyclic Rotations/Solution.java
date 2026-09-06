1class Solution {
public int countGoodRotations(int[] nums) {
// int n=nums.length;
// int array_half=n/2;
int m=nums.length;
int h_num= m/2;
long t=0;
for(int x : nums)
{
t+=x;
}
long w=0;
for(int i=0; i<h_num; i++)
{
w+=nums[i];
}
int ans=0;
for(int j=0; j<m; j++)
{
if(w*2>t)
{
ans++;
}
w-=nums[j];
w+=nums[(j +h_num)%m];
}
return ans;
}
33}