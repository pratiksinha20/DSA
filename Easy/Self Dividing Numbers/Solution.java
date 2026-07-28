int rem=temp%10;
                if(rem==0 || num%rem!=0)
                {
                    return false;
                }
                temp=temp/10;
            }
            return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l=new ArrayList<>();
        for(int i=left; i<=right; i++)
        {
            if(solve(i))
            {
                l.add(i);
            }