mn.offer(mx.poll());
        
        mx.offer(num);
    public void addNum(int num) {
        if (mx.size() < mn.size()) {
            mx.offer(mn.poll());
        }
    }
    
    public double findMedian() {
        if (mx.size() == mn.size()) {
            return (mx.peek() + mn.peek()) / 2.0;
        } else {
            
            return mx.peek();
        }
    }
}