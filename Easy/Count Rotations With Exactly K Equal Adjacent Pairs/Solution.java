1class Solution {
public int countRotations(String s, int k) {
// int m=s.length;
// int eq=0;
// for(int j=0; j<n; j++)
// {
//     if()
// }
int n=s.length();
int s1=0;
for(int i=0; i<n; i++)
{
if(s.charAt(i)==s.charAt((i+1)%n))
{
s1++;
}
}
if(k==s1)
{
return n-s1;
}
if(k==s1-1)
{
return s1;
}
return 0;  
}
28}