// https://leetcode.com/problems/odd-even-linked-list/

class Solution {
    public ListNode oddEvenList(ListNode head) {
    
        if(head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        
        while(even != null && even.next != null) {
            odd.next = even.next;
            odd = even.next;// moving the pointers
            even.next = odd.next; //connecting
            even  = odd.next;
        }
        
        odd.next = evenHead;
        return head;
        
    }
}


// https://leetcode.com/problems/sort-list/

class Solution {
    
    
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!= null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        
        temp.next = null;
        //head.. temp-> null, slow,.. fast->null
        
        ListNode leftSide = sortList(head);
        ListNode rightSide = sortList(slow);
        
        return mergeSort(leftSide, rightSide);
        
        
    }
    public ListNode mergeSort(ListNode left, ListNode right) {
        
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        
        while(left != null && right != null) {
            if (left.val < right.val) {
                current.next = left;
                left = left.next;
            }
            else {
                current.next = right;
                right = right.next;
            }
            
            current = current.next;
        }
        
        // if left linked list is not traversed
        
        while(left != null) {
            current.next = left;
            left = left.next;
        }
        
        // if right linked list is not traversed
        
        while(right != null) {
            current.next = right;
            right = right.next;
        }
        
        return temp.next;
     
        
    }
    
}

//https://leetcode.com/problems/excel-sheet-column-number/

class Solution {
    public int titleToNumber(String s) {
        int p = 0;
        int sum = 0;
        
        for(int i = s.length() - 1; i >=0 ;i--) {
            char c = s.charAt(i);
            // a = 65, b = 66, a-b = 1 + 1 = 2
            int val = (int)c - 65 + 1;
            sum += val*Math.pow(26,p);
            p++;
        }
        
        return sum;
    }
}



