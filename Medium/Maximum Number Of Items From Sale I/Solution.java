// 0/1 knapsack update: iterate budget from high to low so each item
            // contributes at most once per dp state.
            for (int j = budget; j >= price; j--) {
                dp[j] = Math.max(dp[j], dp[j - price] + count);
            }
        }

        // For each possible spent amount i, the remaining budget (budget - i)
        // can be used to buy additional cheapest items, each adding 1 to the count.
        int answer = 0;
        for (int i = 0; i <= budget; i++) {
            answer = Math.max(answer, dp[i] + (budget - i) / minPrice);
        }

        return answer;
    }
}