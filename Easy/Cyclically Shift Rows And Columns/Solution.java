1class Solution {
public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
// int a=grid.length;
// int b=grid[0].length;
// int c=rowShift.length;
// int d=colSwift.length;
int[][] arr= new int[n][n];
for(int i=0; i<n; i++)
{
int r=rowShift[i];
for(int j=0; j<n; j++)
{
int nc=(j - r+n)%n;
arr[i][nc]= grid[i][j];
}
}
int[][] a= new int[n][n];
for(int j=0; j<n; j++)
{
int c=colShift[j];
for(int i=0; i<n; i++)
{
int nr= (i-c+n)%n;
a[nr][j]= arr[i][j];
}
}
return a;
}
33}