class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue();
        for(int i=0; i<stones.length; i++){
            minHeap.offer(0 - stones[i]);
        }

        while(minHeap.size() > 1){
            int x = minHeap.poll();
            int y = minHeap.poll();
            System.out.println(x + " " + y);
            if( x != y){
                minHeap.offer(0 - Math.abs(x-y));
            }
        }
        minHeap.offer(0);
        return 0 - minHeap.poll();
    }
}
