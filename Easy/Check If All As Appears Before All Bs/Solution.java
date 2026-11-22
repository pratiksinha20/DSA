class Solution {
    public boolean checkString(String s) {

        int icount=0;
        int j=0, jcount=0;
        for(int i=0; i+1<s.length(); i++)
        {
            if(s.charAt(i)=='b' && s.charAt(i+1)=='a')
            {
                return false;
            }
        }
        return true;

    }
}