import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/palindrome-linked-list/

//Given the head of a singly linked list, return true if it is a palindrome.
//
//
//
//        Example 1:
//
//
//        Input: head = [1,2,2,1]
//        Output: true
//        Example 2:
//
//
//        Input: head = [1,2]
//        Output: false
//
//
//        Constraints:
//
//        The number of nodes in the list is in the range [1, 105].
//        0 <= Node.val <= 9

// * Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class PalindromeLinkedList {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        List<Character> charArr = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            charArr.add((char)temp.val);
            temp = temp.next;
        }
        int j= charArr.size()-1;
        for (int i = 0; i <= charArr.size()/2; i++) {
            if(charArr.get(i) != charArr.get(j)){
                return  false;
            }
            j--;
        }
        return true;
    }

}
