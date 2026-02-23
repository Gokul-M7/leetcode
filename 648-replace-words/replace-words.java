class Solution {
    public String replaceWords(List<String> d, String sen) {
        Collections.sort(d, (a, b) -> a.length() - b.length());
       String[] arr=sen.split(" ");
       StringBuilder sb=new StringBuilder();
       for(String a :arr)
       {
          String root=a;
          for(String b:d)
          {
            if(a.startsWith(b))
            {
                root=b;
                break;
              }
          }
          sb.append(root).append(" ");
       }
       return sb.toString().trim();
    }
}