/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ptr,ptr2,ptr3 = null;
        ptr = l1;
        ptr2 = l2;
        int value1 , value2,rem = 0,total;
        long sum = 0,sum2= 0 ,count = 0,count2 = 0 ;
        while(ptr != null || ptr2!= null){
            value1 = 0;
            value2 = 0;
            total = 0;
            if(ptr != null){
                value1 = ptr.val; 
            }
            if(ptr2 != null){
                value2 = ptr2.val; 
            }
            
            
            total = value1 + value2 + rem;
            if(total>9){
                total = total%10;
                ptr3 = insertData(ptr3,total);
                rem = 1;
            }
            else{
                ptr3 = insertData(ptr3,total);
                rem = 0;  
            }
            if(ptr != null){
                ptr = ptr.next;
            }
            if(ptr2 != null){
                ptr2 = ptr2.next;
            }
            
            if((ptr == null && ptr2 == null) && rem == 1 ){
                ptr3 = insertData(ptr3,1);
            }
          
        }
        return ptr3;
    }
    
    ListNode insertData(ListNode head , int data){
            ListNode node = new ListNode(data);
            if(head == null){
                
                head = node;
                
            }
            else{
                ListNode last = head;
                while(last.next != null){
                    last = last.next;
                }
                
                last.next = node;
                
                
            }
            
            return head;
            
            
        }
}