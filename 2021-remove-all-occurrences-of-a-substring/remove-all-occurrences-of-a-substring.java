class Solution {
    public String removeOccurrences(String s, String remove) {
        StringBuilder sb = new StringBuilder(s);
         int index;
         while ((index = sb.indexOf(remove)) != -1) {
          sb.delete(index, index + remove.length());
        }

        return sb.toString(); 
    }
}