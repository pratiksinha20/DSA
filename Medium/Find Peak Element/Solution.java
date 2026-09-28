}
                }
                    high = mid - 1;
                } else {
                    low = mid + 1;
                else if (nums[mid] > nums[mid - 1]) {
                }
            else if (mid == 0) {
                if (nums[mid] > nums[mid + 1]) {
                    return 0;
                } else {
                    return 1;
                }
            }
            else if (mid == n - 1) {
                if (nums[mid] > nums[n - 2]) {
                    return mid;
                } else {