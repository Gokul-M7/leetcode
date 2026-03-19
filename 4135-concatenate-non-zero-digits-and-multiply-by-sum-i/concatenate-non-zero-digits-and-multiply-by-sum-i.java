class Solution {
    public long sumAndMultiply(int n) {
     String str = Integer.toString(n);
     int a=str.length();
     StringBuilder sb=new StringBuilder();
     long sum=0;
     for(int i=0;i<a;i++)
     {
        if(str.charAt(i)!='0')
        {
            sb.append(str.charAt(i));
            sum+=str.charAt(i) - '0';
        }
     }
     if (sb.length() == 0) {
            return 0;
        }
     //System.out.println(sum);
     String v=sb.toString();
      //System.out.println(v);
     sum*=Integer.valueOf(v);
     return sum;
    }
}