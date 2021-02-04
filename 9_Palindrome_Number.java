class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0){
            return true;
        }
        if(x  < 0 || x % 10 == 0){
            return false;
        }
        int rev_int = 0;
        while( x > rev_int){
            int pop = x %10;
            x /= 10;
            rev_int = (rev_int * 10) + pop;
        }
        if( x == rev_int || x == rev_int / 10){
            return true;
        }else{
            return false;
        }
        
    }
}