class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            boolean[] seen = new boolean[128];
            int current=0;
            for(int j =i;j<s.length();j++){
                char ch=s.charAt(j);
                if(seen[ch]==true){
                    break;
                }
                seen[ch]=true;
                current++;
                if(current>maxLength){
                    maxLength=current;
                }
            }
        }
        return maxLength;
    }
}