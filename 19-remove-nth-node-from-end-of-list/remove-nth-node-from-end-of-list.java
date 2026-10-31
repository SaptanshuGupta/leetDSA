//THIS IS MY SOLUTION :(not good tho sed neither optimal :( )
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         int count = 0;
//         ListNode temp = head;
//         while (temp != null){
//             count ++;
//             temp = temp.next;
//         }
//           if (count == n){
//             return head.next;
//         }

//         ListNode A = head;
//         int position = count - n ;
//         for (int i = 1 ; i < position ; i++){
//             A = A.next; 
//         }
      
//         A.next = A.next.next;
//         return head;
//     }
    
// }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head ;
        for (int i = 0 ; i < n ; i++ ){
            fast = fast.next;
        }
         if (fast == null) {
            return head.next;
        }
        ListNode slow = head;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}