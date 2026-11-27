// Slide the window one position at a time.
        for (int idx = 1; idx <= this.nums.length - subarrayLen; idx++) {
            // Drop the leftmost element's contribution.
            long leftmost = (this.powers[subarrayLen - 1] * this.nums[idx - 1]) % this.modulo;
            // Add modulo before re-taking modulo to keep the value non-negative.
            currentHash = ((currentHash - leftmost) % this.modulo + this.modulo) % this.modulo;

            // Shift and add the new rightmost element.
            currentHash = (currentHash * this.base + this.nums[idx + subarrayLen - 1]) % this.
            modulo;

            this.hashValues.merge(currentHash, 1, Integer::sum);
        }

        // True if any window appears exactly once.
        return this.hashValues.containsValue(1);
    }
}