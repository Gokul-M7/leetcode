import java.lang.Math;
class Solution {
    public int findClosest(int x, int y, int z) {
        int a=z-x;
        int b=z-y;
        a=Math.abs(a);
        b=Math.abs(b);
        int c=0;
        if(b>a)
        {
          c=1;
        }
        else if(a>b)
        {
          c=2;
        }
        else if(a==b)
          {
         c=0;
         }
       return c;  
    }
}