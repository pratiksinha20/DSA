}
            }
                return windowLen;
class Solution {
    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;

        long base = 19;
        long modulo = 1_000_000_007L;

        long[] powers = new long[n + 1];
        powers[0] = 1;
        for (int idx = 1; idx <= n; idx++) {
            powers[idx] = (powers[idx - 1] * base) % modulo;
        }
        for (int windowLen = 1; windowLen <= n; windowLen++) {
            if (hasUniqueWindow(nums, windowLen, base, modulo, powers)) {
import java.util.HashMap;
import java.util.Map;