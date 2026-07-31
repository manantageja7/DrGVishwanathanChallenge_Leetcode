class Solution {
    public List<String> letterCombinations(String digits) {
        String[] values = {"", "", "abc", "def", "ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> list = new ArrayList<>();
        if(digits.length()==0){
            return list;
        }
        list.add("");
        for(int i=0;i<digits.length();i++){
            String letters=values[digits.charAt(i)-'0'];
            List<String> temp=new ArrayList<>();
            for(String s:list){
                for(int j=0;j<letters.length();j++){
                    temp.add(s+letters.charAt(j));
                }
            }
            list=temp;
        }
        return list;
    }
}