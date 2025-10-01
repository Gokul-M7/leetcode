class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int a=numBottles;
        int b=numExchange;
        int sum=a;
        int c,d,e,f,g;
        c=a/b;
        d=a%b;
        e=c+d;
        sum+=c;
        while(e>=b)
        {
            f=e/b;
            g=e%b;
            sum+=f;
            e=f+g;        
        }
        return sum;
    }
}