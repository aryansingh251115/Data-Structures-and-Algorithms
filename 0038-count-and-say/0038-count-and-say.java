class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        return helper(n);
    }

    private String helper(int n){
        if(n==1){
            return "1";
        }

        String temp = helper(n-1);
        StringBuilder ans = new StringBuilder();
        char arr[] = temp.toCharArray();
        int count = 1;
        int i = 0;
        while(i < arr.length){
            char ch = arr[i];
            if(i+1 <arr.length && arr[i] == arr[i+1]){
                count++;
                i++;
            }
            else{
                ans.append(count);
                ans.append(ch);
                count = 1;
                i++;
            }
        }
    return ans.toString();
    }
}