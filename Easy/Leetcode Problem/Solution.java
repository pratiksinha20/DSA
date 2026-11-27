1class Solution {
2public:
int maximumSaleItems(vector<vector<int>>& items, int budget) {
int n = items.size();
int minPrice = INT_MAX;
vector<int> bonus(n, 0);
for (int i = 0; i < n; i++) {
minPrice = min(minPrice, items[i][1]);
for (int j = 0; j < n; j++) {
if (i != j && items[j][0] % items[i][0] == 0) {
bonus[i]++;
}
}
}
vector<int> dp(budget + 1, -1);
dp[0] = 0;
for (int i = 0; i < n; i++) {
int price = items[i][1];
int value = 1 + bonus[i];
for (int b = budget; b >= price; b--) {
if (dp[b - price] != -1) {
dp[b] = max(dp[b], dp[b - price] + value);
}
}
}
int ans = 0;
for (int spent = 0; spent <= budget; spent++) {
if (dp[spent] != -1) {
int total = dp[spent] +
(budget - spent) / minPrice;
ans = max(ans, total);
}
}
return ans;
}
46};