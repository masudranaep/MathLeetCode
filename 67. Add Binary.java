class Solution {
    public String addBinary(String a, String b) {
        StringBuilder  sb  = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int curry = 0;
        while(i >= 0 || j >= 0){
            int sum = curry;
            if(i >= 0){
                sum += a.charAt(i --) - '0';
            }
            if(j >= 0){
                sum += b.charAt(j--) -'0';
            }
            sb.insert(0, sum%2);
            curry = sum/2;
        }
        if(curry > 0){
            sb.insert(0,1);
        }
        return sb.toString();
    }
}