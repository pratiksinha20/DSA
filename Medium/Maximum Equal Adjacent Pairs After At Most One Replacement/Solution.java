1class Solution {
public int maxEqualAdjacentPairs(int[] nums) {
int n= nums.length;
// int num[0]= nums[0];
// List<Integer> l= new ArrayList<>();
int ans=0;
HashMap<Long, Integer> map= new HashMap<>();
for(int i=0; i<n-1; i++)
{
int a= nums[i];
int b= nums[i+1];
if(a==b)
{
ans++;
}
else
{
int s= Math.min(a, b);
int l= Math.max(a, b);
long k= (long) s* 1000001+l;
int count=map.getOrDefault(k, 0)+1;
map.put(k,count);
}
}
int mG=0;
for(int count: map.values())
{
mG= Math.max(mG, count);
}
return ans+mG;
}
38}