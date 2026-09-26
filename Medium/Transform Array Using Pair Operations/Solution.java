1class Solution {
public boolean canTransform(int[] source, int[] target) {
// int n=source.length;
// int m= target.length;
long totalSou= 0;
long totalTar=0;
int n= source.length;
for(int i=0; i<n; i++)
{
totalSou+=source[i];
}
for(int i=0; i<n; i++)
{
totalTar +=target[i];
}
return totalSou==totalTar;
}
20}