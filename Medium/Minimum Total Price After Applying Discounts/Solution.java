1class Solution {
public double minPrice(int[] prices, int[] discounts) {
int n = prices.length;
int m = discounts.length;
int mn = Math.min(n, m);
// int i = n - 1;
// int j = m - 1;
double sum = 0.0;
Arrays.sort(prices);
Arrays.sort(discounts);
// while (i >= Math.abs(n - mn) && j >= Math.abs(m - mn)) {
for(int i=0; i<mn; i++){
int price=prices[n-1-i];
int discount=discounts[m-1-i];
sum+=(double) price*(100-discount)/100.0;
// double d = (prices[i] * (100 - discounts[j]) / 100);
// sum += d;
// i--;
// j--;
}
if (n > m) {
for (int a = 0; a < n - m; a++) {
sum += prices[a];
}
}
return sum;
}
30}