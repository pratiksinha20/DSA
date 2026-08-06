class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int ans=0;
        // List<Integer> hash=new ArrayList<>();
        // Arrays.fill(hash, -1);
        int[] hash=new int[256];
        Arrays.fill(hash, -1);
        while(r<s.length())
        {
            if(hash[s.charAt(r)]!=-1)