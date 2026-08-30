1class Solution {
public int sumDecoded(long[] nums) {
// int n=nums.length;
// for(int i=0; i<n; i++){
// int width=nums[i]%10;
//     int di=floor(nums[i]/10;)
//     }
long mod= 1000000007l;
long t=0;
for(long num: nums)
{
int wid= (int) (num%10);
long d=num/ 10;
int digits= String.valueOf(d).length();
long div=1;
for(int i=0 ; i<digits - wid; i++)
{
div*=10;
}
long x= d/div;
long y= d% div;
long val =1;
long base =x%mod;
while(y>0)
{
if(y%2==1)
{
val=(val* base) %mod;
}
base=(base * base)%mod;
y/=2;
}
t = (t+val) % mod;
}
return (int)t;
}
42}