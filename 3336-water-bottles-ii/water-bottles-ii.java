class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans=numBottles;
        int x=numExchange;
        while(numBottles>=x)
        {
            numBottles-=x-1;
            x++;
            ans++;
        }
        return ans;
    }
}