package Algos.Heap;

import java.util.PriorityQueue;

public class mergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b)->a.val-b.val);
        for(ListNode ls : lists) {
            while(ls != null) {
                pq.add(ls);
                ls = ls.next;
            }
        }
        ListNode ans = pq.poll();
        ListNode temp=ans;
        while(!pq.isEmpty()) {
            temp.next = pq.poll();
            temp=temp.next;
        }
        if(temp!=null){
            temp.next=null;
        }
        return ans;
    }
}
