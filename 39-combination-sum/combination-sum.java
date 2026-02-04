class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> l = new ArrayList<>();
        if( n == 0 ) return l;
        backtrack(candidates,0,new ArrayList<>(),l,target);
        return l;
    }
    static void backtrack(int[] can , int in , List<Integer>  path , List<List<Integer>> l ,int  t  ){
        int n = can.length;
        if( t == 0){
            l.add(new ArrayList<>(path));
            return;
        }
        if(t < 0){
            return;
        }
        for(int i = in ; i < n ; i++){
            path.add(can[i]);
            backtrack(can, i , path , l , t - can[i] );
            path.remove(path.size() - 1 );
        }
    }
}