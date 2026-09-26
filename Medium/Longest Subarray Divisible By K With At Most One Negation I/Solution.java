1class Solution {
public int longestSubarray(int[] nums, int k) {
int n= nums.length;
int ans=0;
for(int i=0; i<n; i++)
{
long s=0;
HashSet<Integer> set= new HashSet<>();
for(int j=i; j<n; j++)
{
s+=nums[j];
int val= (int) ((2L* nums[j]) %k);
if(val<0)
{
val+=k;
}
set.add(val);
int rem= (int)(s % k);
if(rem<0)
{
rem+=k;
}
if(rem==0 || set.contains(rem)){
ans=Math.max(ans, j-i+1);
}
}
}
return ans;
}
31}