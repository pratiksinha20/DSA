private long modulo;
    private long base;
    private int[] nums;
class Solution {
import java.util.HashMap;
import java.util.Map;

}

            hashCounts.merge(currentHash, 1, Integer::sum);
        }
        return hashCounts.containsValue(1);
    }
            currentHash = (currentHash * base + nums[idx + windowLen - 1]) % modulo;

            currentHash = ((currentHash - leftmostContribution) % modulo + modulo) % modulo;
        for (int idx = 1; idx <= n - windowLen; idx++) {
            long leftmostContribution = (powers[windowLen - 1] * nums[idx - 1]) % modulo;
        hashCounts.put(currentHash, 1);
        }