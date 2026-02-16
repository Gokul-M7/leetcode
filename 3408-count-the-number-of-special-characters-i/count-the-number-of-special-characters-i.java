class Solution {
    public int numberOfSpecialChars(String word) {
       HashMap<Character,Integer> ans=new HashMap<>();
       HashMap<Character,Integer> ans2=new HashMap<>();
       for(char a :word.toCharArray())
       {
        if(Character.isLowerCase(a))
        {
        ans.putIfAbsent(a,0);
        }else
        {
            ans2.putIfAbsent(a,0);
        }
       }
       int count=0;
       for(char v :ans.keySet())
       {
           char b = Character.toUpperCase(v);
           if(ans2.containsKey(b))
           {
                count++;
            }
       }
       return count;
    }
}