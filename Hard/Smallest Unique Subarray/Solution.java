long currentHash = 0;
        // Build the hash of the first window [0, windowLen).

        Map<Long, Integer> hashCounts = new HashMap<>();
        // Count occurrences of each window hash.
        int n = nums.length;

            long[] powers) {
            long modulo,
            long base,
            int windowLen,
            int[] nums,
    private boolean hasUniqueWindow(

    }
        return n; // Fallback (every element distinct trivially gives length 1).
        for (int idx = 0; idx < windowLen; idx++) {
            currentHash = (currentHash * base + nums[idx]) % modulo;
        }
        hashCounts.put(currentHash, 1);
        for (int idx = 1; idx <= n - windowLen; idx++) {