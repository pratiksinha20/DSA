}
            else if (mid == 0) {
                if (nums[0] > nums[1]) {
                    return 0;
                } else {
                    return 1;
                }
            }
            else if (mid == n - 1) {
                if (nums[n-1] > nums[n - 2]) {
                    return mid;
                } else {
                    return n - 2;
                }
            }
        }
        return 0;
    }