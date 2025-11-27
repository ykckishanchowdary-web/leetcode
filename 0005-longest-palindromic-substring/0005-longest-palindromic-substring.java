class Solution {
    public String longestPalindrome(String s) {

        for(int x=s.length();x>0;x--){
            for(int y=0;y<=s.length()-x;y++){
                if(checksubString(y,y+x,s)){
                    return s.substring(y,y+x);
                }
            }

        }

        return "";
        
    }


    private boolean checksubString(int i, int j, String s){
        int left = i;
        int right = j-1;

        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}