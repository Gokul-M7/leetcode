class Solution {
    public int countDigits(int num) {
        int count=0;
        int v=num;
        while(num>0)
        {
            int x=num%10;
            if(v%x==0)
            {
                count++;
            }
            num/=10;
        }
        return count;
    }
}