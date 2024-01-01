package Algos.Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer in : nums){
            map.put(in,map.getOrDefault(in,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (map.get(a) - map.get(b)));
        for(Integer in : map.keySet()){
            pq.add(in);
            if(pq.size() > k ){
                pq.poll();
            }

        }
        int[] res=new int[k];
        for(int i=0 ;i <k ;i++){
            res[i]=pq.poll();
        }
        return res;

    }
}
