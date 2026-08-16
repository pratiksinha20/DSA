1class Solution {
public int nearestDrone(int[][] drones, int[] target) {
int n=drones.length;
int ans=-1;
int mx=Integer.MAX_VALUE;
for(int i=0; i<n; i++)
{
int disX=Math.abs(drones[i][0]-target[0]);
int disY=Math.abs(drones[i][1] - target[1]);
int dis=disX+disY;
if(dis<=drones[i][2] && dis<mx)
{
mx=dis;
ans=i;
}
}
return ans;
}
24}