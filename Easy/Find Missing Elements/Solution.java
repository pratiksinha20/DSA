List<Integer> arr=new ArrayList<>(n);
        int t=nums[n-1]-nums[0]+1
        for(int i=0; i<n-1; i++)
        {
            if(nums[i]!=nums[i+1]-1)
            {
                arr.add(nums[i]+1);
            }
        }
        if(n==arr.size())
        {
            return arr;
        Arrays.sort(nums);
        int n=nums.length;
    public List<Integer> findMissingElements(int[] nums) {
class Solution {