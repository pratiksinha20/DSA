1class Solution {
public int[] rearrangeArray(int[] nums) {
int[] count= new int[101];
int n= nums.length;
// for(int i=0; i<n; i++ )
// {
//     count[num[i]]++;
// }
for(int x: nums)
{
count[x]++;
}
int[] ans= new int [n];
int ind=0;
while(ind<nums.length)
{
for(int i=1; i<=100; i++)
{
if(count[i]>0)
{
ans[ind]=i;
ind++;
count[i]--;
}
}
}
return ans;
}
31}