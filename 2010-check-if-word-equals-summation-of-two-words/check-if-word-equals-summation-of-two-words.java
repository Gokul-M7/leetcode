class Solution {
    public boolean isSumEqual(String f, String s, String t) {
         int j=0,sum1=0,sum2=0,ans=0;

        for(char i:t.toCharArray())
            ans=ans*10+(i-'a');

        for(char i:f.toCharArray())
        sum1=sum1*10+(i-'a');
        

        for(char i:s.toCharArray())
        sum2=sum2*10+(i-'a');

        return ans==(sum1+sum2);
    }
}