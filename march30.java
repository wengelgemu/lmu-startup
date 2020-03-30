class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        boolean check = false;
        
        for (int i=s.length()-1; i>=0; i--){
            char lastChar = s.charAt(i);
            if((lastChar>='a' && lastChar<='z') || (lastChar>='A' && lastChar<='Z')){
                check = true;
                length++;
            }else{
                if (check){
                    return length;
                }
            }
        }
        return length;
    }
}
