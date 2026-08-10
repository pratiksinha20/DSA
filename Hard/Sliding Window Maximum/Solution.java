class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        PriorityQueue<Pair<Integer,Integer>> pq=new 
        PriorityQueue<>();
        List<Integer> li=new ArrayList<>();

        for(int i=0; i<k; i++)
        {
            pq.add({nums[i], i});

        }
        li.add(pq.peek().first);

        for(int i=k; i<n; i++)
        {