for(int i=0; i<k; i++)
        {
            pq.add({nums[i], i});
        }

        li.add(pq.peek().first);

        for(int i=k; i<n; i++)
        {
            pq.add({nums[i], i});
        }

            if(!pq.empty() &&pq.peek().first<i-k+1)