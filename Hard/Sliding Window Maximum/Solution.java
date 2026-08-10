PriorityQueue<Pair<Integer,Integer>> pq=new PriorityQueue<>();
        List<Integer> li=new ArrayList<>();

        for(int i=0; i<k; i++)
        {
            pq.add({nums[i], i});

        }
        li.add(pq.peek().first);

        for(int i=k; i<n; i++)
        {
            pq.add({nums[i], i});

            while(!pq.empty() &&pq.peek().first<i-k+1)
            {
                pq.poll();
            }
        int n=nums.length;
    public int[] maxSlidingWindow(int[] nums, int k) {
class Solution {