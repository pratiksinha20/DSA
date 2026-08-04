int n=nums.length;
        Arrays.sort(nums);
        List<Integer> arr=new ArrayList<>(n);
        
        for(int i=0; i<n; i++)
        {
            if(nums[i]!=nums[i]-1)
            {
                arr.add(nums[i]+1);
            }
        }
        if(n==arr.size())
        {
            return arr;
        }
        return new ArrayList<>();
    }
}