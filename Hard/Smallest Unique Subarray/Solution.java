int n = nums.length;
        Map<Long, Integer> hashCounts = new HashMap<>();

        long currentHash = 0;
        for (int idx = 0; idx < windowLen; idx++) {
            currentHash = (currentHash * base + nums[idx]) % modulo;
        }
        hashCounts.put(currentHash, 1);
        for (int idx = 1; idx <= n - windowLen; idx++) {
            long leftmostContribution = (powers[windowLen - 1] * nums[idx - 1]) % modulo;
            currentHash = ((currentHash - leftmostContribution) % modulo + modulo) % modulo;
            currentHash = (currentHash * base + nums[idx + windowLen - 1]) % modulo;

            hashCounts.merge(currentHash, 1, Integer::sum);
        }
        return hashCounts.containsValue(1);
    }
}

import java.util.HashMap;