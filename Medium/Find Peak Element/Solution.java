}
            }
            else if (mid == n - 1) {
                if (nums[n-1] > nums[n - 2]) {
                    return n-1;
                } else {
                    return n - 2;
                }
            }
        }
        return 0;
    }
}