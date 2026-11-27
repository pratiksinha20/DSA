for (int j = budget; j >= price; j--) {
                dp[j] = Math.max(dp[j], dp[j - price] + count);
            }
        }

        int answer = 0;
        for (int i = 0; i <= budget; i++) {
            answer = Math.max(answer, dp[i] + (budget - i) / minPrice);
            }
                }
                    count++;
                if (otherItem[0] % factor == 0) {
            for (int[] otherItem : items) {
            int count = 0;
            // This determines the "value" gained by selecting this item.
            // Count how many items have a factor divisible by the current item's factor.

            minPrice = Math.min(minPrice, price);
        }

        return answer;