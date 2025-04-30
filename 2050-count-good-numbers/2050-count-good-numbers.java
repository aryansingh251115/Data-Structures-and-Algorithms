class Solution {
    public int mod = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long odd = n/2;
        long even  = n%2 +n/2;
        long ans = (pow(4,odd) * pow(5,even))%mod;
        return (int)ans;
    }

    private long pow(int x,long n){
        if(n == 0){
            return 1;
        }
        long fin = 0;
        long ans = 0;
        if(n%2 == 0){
            ans = pow(x,n/2);
            fin = (ans*ans)%mod;           
        }
        else{
            ans = pow(x,n/2);
            fin = (ans*ans*x)%mod;
        }
    return fin;
    }
}