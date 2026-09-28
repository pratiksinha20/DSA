import java.util.*;

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] time : times) {
            graph.computeIfAbsent(time[0], x -> new ArrayList<>
            ()).add(new int[]{time[1], time[2]});
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
        Integer.compare(a[0], b[0]));
        pq.offer(new int[]{0, k});   
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;

        while (!pq.isEmpty()) {
            int[] current = pq.poll();