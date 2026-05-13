class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for( int s : stones){
            minHeap.offer( 0 - s);
        }
        while(minHeap.size() > 1){
            int x = minHeap.poll();
            int y = minHeap.poll();
            if(x!=y){
                minHeap.offer(0 - Math.abs(x - y));
            }
        }
            minHeap.offer(0);
            return 0 - minHeap.peek();
    }
}
