public class Solution {

    public static int maxArea(int[] height)
    {

        int maxArea = 0;
        int currentArea = 0;
        int L = 0;
        int R = height.length-1;
        while( L < R)
        {

            if(height[L] < height[R])
            {
               currentArea = (R-L)*height[L];
               L++;
            
            }else {
                currentArea = (R-L)*height[R];
                R--;
            
            }
            if(currentArea > maxArea)
                {
                    maxArea = currentArea;
                }
        }
        return maxArea;
    }
}

