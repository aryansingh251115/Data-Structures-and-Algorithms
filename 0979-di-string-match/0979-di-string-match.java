class Solution {
    public int[] diStringMatch(String s) {
        int low = 0;
        int arr[] = new int[s.length()+1];
        int high = s.length();
        for(int i =0 ;i<s.length();i++){
            char temp = s.charAt(i); 
            if(temp == 'I'){
                arr[i] = low++;
            }
            else{
                arr[i] = high--;
            }
        }
        arr[s.length()] = low;
    return arr;
    }
}