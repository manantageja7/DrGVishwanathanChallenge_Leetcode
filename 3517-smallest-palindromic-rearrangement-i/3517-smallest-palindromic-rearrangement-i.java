class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        String middle="";
        for(int i=0;i<26;i++){
            while(freq[i]>=2){
                sb.append((char)(i+'a'));
                freq[i]-=2;
            }
            if(freq[i]==1){
                middle=String.valueOf((char)(i+'a'));
            }
        }
        String m = new StringBuilder(sb).reverse().toString();
        return sb.toString()+middle+m;
        
    }
}