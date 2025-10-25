class Solution {
    public String lexSmallest(String s) {
        String finalAns = s;
        for(int i =1 ;i<s.length();i++){
            String substr = s.substring(0,i);
            String rev = new StringBuilder(substr).reverse().toString();
            String remainStr = s.substring(i);
            String finalStr = rev + remainStr;
            if(finalAns.compareTo(finalStr) > 0 ){
                finalAns = finalStr;
            }
        }

        int n = s.length();
        for(int i = 1; i<=s.length();i++ ){
            String substr = s.substring(n-i);
            String rev = new StringBuilder(substr).reverse().toString();
            String remainStr = s.substring(0,n-i);
            String finalStr = remainStr + rev;
            if(finalAns.compareTo(finalStr) > 0 ){
                finalAns = finalStr;
            }
        }
    return finalAns;
    }
}