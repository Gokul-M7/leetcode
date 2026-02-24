class Solution {
    public String defangIPaddr(String s) {
       String a="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                a += "[.]";
            } else {
                a += s.charAt(i);
            }
        }
        return a;
    }
}