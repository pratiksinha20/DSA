2class Solution {
3public:
int digitSum(int n) {
int sum = 0;
while (n > 0) {
sum += n % 10;
n /= 10;
}
return sum;
}
int minSwaps(vector<int>& nums) {
vector<int> sorted = nums;
sort(sorted.begin(), sorted.end(), [&](int a, int b) {
if (digitSum(a) == digitSum(b))
return a < b;
return digitSum(a) < digitSum(b);
});
unordered_map<int, int> pos;
for (int i = 0; i < sorted.size(); i++)
pos[sorted[i]] = i;
vector<bool> visited(nums.size(), false);
int swaps = 0;
for (int i = 0; i < nums.size(); i++) {
if (visited[i] || pos[nums[i]] == i)
continue;
int j = i, cycle = 0;
while (!visited[j]) {
visited[j] = true;
j = pos[nums[j]];
cycle++;
}
swaps += cycle - 1;
}
return swaps;
}
46};
47