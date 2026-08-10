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
            li.add(pq.peek().first);
        }
        return li;
    }
}