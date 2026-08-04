int n=nums.length;
        Arrays.sort(nums);
        List<Integer> arr=new ArrayList<>(n);
        int t=nums[n-1]-nums[0]+1;
        for(int i=nums[0]; i<nums[n-1]; i++)
        {
            // if(nums[i]!=nums[i+1]-1)
            // {
            //     
            // }
            if(i+1!=nums[n-1])
            {
                arr.add(i+1);
            }
        }
        if(t-n==arr.size())
        {
            return arr;