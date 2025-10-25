class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(9*num < sum)return "";

        int remaSum = sum;
        StringBuilder str = new StringBuilder();

        while(num > 0){
            int digit = Math.min(9,remaSum);
            str.append(digit);
            remaSum = remaSum - digit;
            num--;
        }
        return str.toString();
    }
}