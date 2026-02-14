class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> ans=new HashMap<>();
       Map<Integer,Integer> map = new HashMap<>();
        for(int n : arr){
            map.put(n,map.getOrDefault(n,0)+1);  
        }
        int max = -1;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int key = e.getKey();
            int val = e.getValue();
            if(key==val){
                max=Math.max(max,key);
            }           
        }
        return max;
    }
}