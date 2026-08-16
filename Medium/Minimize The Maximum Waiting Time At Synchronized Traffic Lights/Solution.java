1class Solution {
public int minPenalty(int period, int[] lights, int[] arrivalTime) {
int g=0;
for(int i:lights)
{
if(i>g)
{
g=i;
}
}
int ans=0;
for(int j:arrivalTime)
{
int a=j%period;
int w=0;
if(a>=g)
{
w=period-a;
}
if(w>ans)
{
ans=w;
}
}
return ans;
}
32}