class Solution {
    public long numberOfPowerfulInt(long start, long finish, int limit, String s) {
        String strt = String.valueOf(start-1);
        String fnsh = String.valueOf(finish);
        return solve(fnsh,limit,s) - solve(strt,limit,s);
    }
    private long solve(String start , int limit,String suffix){
        if(start.length() < suffix.length()){
            return 0;
        }
        long count = 0;
        String trailing = start.substring(start.length() - suffix.length());
        int prefixLen = start.length() - suffix.length();
        for(int i = 0 ;i<prefixLen;i++){
            int digit = start.charAt(i) - '0';

            if(digit <= limit){
                count += digit * Math.pow(limit+1 , prefixLen-i-1);
            }
            else{
                count+= Math.pow(limit+1,prefixLen-i);
                return count;
            }
        }
        if(trailing.compareTo(suffix) >= 0){
            count++;
        }
    return count;
    }
}