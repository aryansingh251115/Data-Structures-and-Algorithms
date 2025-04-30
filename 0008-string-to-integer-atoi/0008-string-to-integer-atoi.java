class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length()== 0){
            return 0;
        }
        int sign = 1;
        int idx = 0;
        if(s.charAt(0) == '-'){
            sign = -1;
            idx++;
        }if(s.charAt(0) == '+'){
            sign = 1;
            idx++;
        }
        return helper(s,idx,0,sign);
    }

    private int helper(String s , int idx, int result,int sign){
        if(idx>=s.length() || !Character.isDigit(s.charAt(idx))){
            return (int)sign*result; 
        }
        
        int temp = s.charAt(idx) - '0';
        if(result > (Integer.MAX_VALUE -temp)/10){
            return sign == -1? Integer.MIN_VALUE :Integer.MAX_VALUE;
        }
        result = result*10 + temp;

        return helper(s,idx+1,result,sign);
        
    }
}