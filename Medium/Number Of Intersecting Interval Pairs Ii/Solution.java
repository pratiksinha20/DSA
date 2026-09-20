1class Solution {
public long countIntersectingIntervals(int[][] intervals) {
// int n=intervals.length();
// int m= intervals[0].length();
// int a= m-n;
int n= intervals.length;
int[] starts= new int[n];
int[] ends= new int[n];
for(int i=0; i<n; i++)
{
starts[i]= intervals[i][0];
ends[i]= intervals[i][1];
}
Arrays.sort(starts);
Arrays.sort(ends);
long sol=0;
int a=0;
for(int i=0; i<n; i++)
{
while(a<n && ends[a]<starts[i])
{
a++;
}
sol+=i-a;
}
return sol;
}
34}