class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int sum=0;
        int temp=x;
        if(x>0){
            while(temp!=0){
                int digit=temp%10;
                sum=sum*10+digit;
                temp=temp/10;
            }
        }
        return sum==x;
    }
}