


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
        	return null;
        }
        ListNode mergedList = new ListNode(0);
        ListNode temp = mergedList;
        while (list1 != null || list2 != null) {
        	if (list1 == null) {
        		mergedList.next = list2;
        		break;
        	} else if (list2 == null) {
        		mergedList.next = list1;
        		break;
        	} else {
        		if (list1.val < list2.val) {
        			mergedList.next = list1;
        			list1 = list1.next;
        		} else {
        			mergedList.next = list2;
        			list2 = list2.next;
        		}
    			mergedList = mergedList.next;
        	}
        }//end while
        return temp.next;
    }
}

