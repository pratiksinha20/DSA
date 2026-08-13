int i=0;
        while(i<nums.length-1 && nums[i]+1==nums[i+1])
        {
            sum+=nums[i+1];
            i++;
        }

        for(int num: nums)
        {
            set.add(num);
        }

        while(set.contains(sum))
        {
            sum++;
        }
        return sum;
        
    }
}