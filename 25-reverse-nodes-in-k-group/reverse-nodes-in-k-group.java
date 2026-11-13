class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        if(head == null || k ==1){
            return head;
        }

        ListNode temp = head;
        int count= 0;
        
        while (count < k){
            if(temp == null){
                return head;
            }
            temp = temp.next;
            count ++;
        }

        ListNode prev = reverse (head , k);
        head.next = reverseKGroup(temp , k);
        return prev;

    }

    public ListNode reverse (ListNode head , int k) {
        ListNode prev = null;
        ListNode curr = head ;
        while ( k > 0 && curr != null){
            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;

            k--;
        }
        return prev;

    }
        
    
}