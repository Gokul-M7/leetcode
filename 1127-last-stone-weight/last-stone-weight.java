class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int a:stones)
        {
            pq.add(a);
        }
        while(pq.size()>1)
        {
            int a=pq.poll();
            int b=pq.poll();
            if(a!=b)
            {
                pq.add(Math.abs(b-a));
            }
        }
        return pq.size()==1 ? pq.poll() : 0;
    }
}