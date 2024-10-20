//Approach 1
class Solution {
    public int tribonacci(int n) {
        if(n == 1 || n == 2) return 1;
        if(n == 0) return 0;
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 0;
        for (int i = 3; i <= n; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
    return d;
    }
}

// done by using hint 1 but without any other help

// class Solution {
// public int tribonacci(int n) {
// int arr[] = new int[38];
// arr[0] = 0;
// arr[1] = 1;
// arr[2] = 1;
// for(int i = 3;i <=37;i++){
// arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
// }
// return arr[n];
// }
// }