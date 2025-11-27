class Solution {
    public boolean isPalindrome(int x) {

       // 5665

       int temp = 0;

       int  n = x;   // n = 5665

       while(n > 0){

        int l = n%10;     
        temp = temp*10+l;  
        n = n/10;  
       }

      boolean y = (temp==x)?true : false ;

      return y;

}
}