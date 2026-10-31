class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null){
            count ++ ;
            temp = temp.next;
        }
        int position = count / 2;
        ListNode current = head;
        for (int i = 0 ; i < position ; i ++){
            current = current.next;
        }
     
        return current;
    }
}