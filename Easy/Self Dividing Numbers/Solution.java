public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l=new ArrayList<>();
        for(int i=left; i<=right; i++)
        {
            if(solve(i))
            {
                l.add(i);
            }
        }
        return l;
    }
}