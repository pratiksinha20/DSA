class Solution {
    public int maxProduct(int n) {
        List<Integer> arr=new ArrayList<>();
        // int mxVal=Integer.MIN_VALUE;
        // int mx=1;
        // int digit=0;
        while(n!=0)
        {
            int rem=n%10;
            n=n/10;
            arr.add(rem);    
        }
        Collections.sort(arr);
        int m=arr.size();
        return arr.get(m-1)*arr.get(m-2);
    }
}