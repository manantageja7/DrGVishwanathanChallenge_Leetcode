class Solution {
    public int numberOfSpecialChars(String word) {
        int sum=0;
        boolean[] counted = new boolean[26];
        for(int i=0;i<word.length();i++){
            for(int j=i+1;j<word.length();j++){
                char a = word.charAt(i);
                if((word.charAt(i)==word.charAt(j)+32)||(word.charAt(i)+32==word.charAt(j))){
                    char ch = Character.toLowerCase(a);
                    if (!counted[ch - 'a']){
                        counted[ch-'a']=true;
                        sum++;
                    }
                }

            }
        }
        return sum;
    }
}