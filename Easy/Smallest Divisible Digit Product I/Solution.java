int mul=1;
            int num=i;
            while(num!=0)
            {
                int rem=num%10;
                num=num/10;
                mul=mul*rem;
            }
            if(mul%t!=0)
            {
                i++;
            }
            else
            {
                ans=i;
                break;
            }
        while(i<=100)
        {
        int ans=0;
        int i = n;
        
    public int smallestNumber(int n, int t) {
class Solution {