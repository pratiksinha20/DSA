}
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>K)
        {
            pq.poll();
        }
        return pq.poll();  
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */