public class LeetCode {
    
 // Definition for singly-linked list.
public class ListNode {
int val;
ListNode next;
ListNode() {}
ListNode(int val) { this.val = val; }
ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode  removeNthFromEnd(ListNode head, int n) {//function removeNthFromEnd with parameter of Node head and the Nth node from the end of the Linked List.
        ListNode dummy=new ListNode(0);//A dummy node before the head of the LinkedList
        dummy.next=head;//placement of dummy node
        ListNode pointer1=dummy;//pointer1 Node is created pointing at the dummy node
        ListNode pointer2=dummy;//pointer2 Node is created pointing at the dummy node
        //pointer 2 is shifted to n times ahead of the dummy node and the pointer1.
        for(int i=0; i < n;i++){
            pointer2=pointer2.next;
        }
        //this loop is executed until we reach the last node in the LinkedList
        while(pointer2.next!=null){
            pointer1=pointer1.next;//pointer1 is then also shifted until the pointer2 reaches the last node. 
            pointer2=pointer2.next; //this is done in order to maintain the difference 'n' between pointer1 and pointer2 so that when pointer2 reaches the end then pointer1 reaches n times behind the end node.                  
        }
        pointer1.next=pointer1.next.next;//then the connection between pointer1 and the node next to the node which is to removed is established.
        return dummy.next;//head of the list is returned.

        
    }
}
}
