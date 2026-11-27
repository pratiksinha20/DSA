}
        return n; 

        }
            }
                return windowLen;
            if (hasUniqueWindow(nums, windowLen, base, modulo, powers)) {
        for (int windowLen = 1; windowLen <= n; windowLen++) {
        }
            powers[idx] = (powers[idx - 1] * base) % modulo;
        for (int idx = 1; idx <= n; idx++) {
        powers[0] = 1;
        long[] powers = new long[n + 1];
        // Precompute base powers once: powers[i] = base^i mod modulo.

        long modulo = 1_000_000_007L;
        long base = 19;

        int n = nums.length;
    public int smallestUniqueSubarray(int[] nums) {
    // Primary (correct) approach: try each window length from smallest to largest.