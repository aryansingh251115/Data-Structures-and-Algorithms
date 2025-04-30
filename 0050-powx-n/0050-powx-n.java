class Solution {
    public double myPow(double x, int n) {
        int N = Math.abs(n);
        if(n<0){
            x=1/x;

        }
        return pow(x,N);
    }

    private double pow(double x, int n){
        if(n==0){
            return 1.0;
        }
        double fin = 0; 
        if(n%2 == 0){
            double ans = pow(x,n/2);
            fin = ans *ans;

        }else{
            double ans = pow(x,n/2);
            fin = ans*ans*x;
        }
    return fin;
    }
}