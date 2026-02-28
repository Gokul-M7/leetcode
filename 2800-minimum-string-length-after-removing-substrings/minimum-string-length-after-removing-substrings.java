class Solution {
    public int minLength(String s) {
       StringBuilder sb=new StringBuilder(s);
       int index;
     while (true) {
            if ((index = sb.indexOf("AB")) != -1) {
                sb.delete(index, index + 2);
            } 
            else if ((index = sb.indexOf("CD")) != -1) {
                sb.delete(index, index + 2);
            } 
            else {
                break; // no AB or CD left
            }
        }
       return sb.length();
    }
}