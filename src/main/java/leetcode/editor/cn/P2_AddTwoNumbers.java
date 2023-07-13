//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。 
//
// 请你将两个数相加，并以相同形式返回一个表示和的链表。 
//
// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 
//
// 示例 1： 
// 
// 
//输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[7,0,8]
//解释：342 + 465 = 807.
// 
//
// 示例 2： 
//
// 
//输入：l1 = [0], l2 = [0]
//输出：[0]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//输出：[8,9,9,9,0,0,0,1]
// 
//
// 
//
// 提示： 
//
// 
// 每个链表中的节点数在范围 [1, 100] 内 
// 0 <= Node.val <= 9 
// 题目数据保证列表表示的数字不含前导零 
// 
//
// Related Topics 递归 链表 数学 👍 9733 👎 0


package leetcode.editor.cn;


import java.nio.Buffer;

/**
 * 两数相加
 * @author DY
 * @date 2023-07-05 18:56:07
 */
public class P2_AddTwoNumbers{
	 public static void main(String[] args) {
	 	 //测试代码
	 	/* Solution solution = new P2_AddTwoNumbers().new Solution();
         ListNode listNode = new ListNode(2);
         listNode.next = new ListNode(4);
         listNode.next.next =  new ListNode(3);
         ListNode listNode1 = new ListNode(5);
         listNode1.next = new ListNode(6);
         listNode1.next.next =  new ListNode(4);

         ListNode listNode2 = solution.addTwoNumbers(listNode, listNode1);
         while (listNode2!=null){
             System.out.println(listNode2.val);
             listNode2 = listNode2.next;
         }*/
     }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

 //Definition for singly-linked list.


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        while(head1 != null){
            if (head2 != null){
                head1.val += head2.val;
                head2 = head2.next;
            }
            if (head1.next == null && head2 != null){
                head1.next = head2;
                break;
            }
            head1 = head1.next;
        }
        merge(l1);
        return l1;
    }
    public void merge(ListNode l1){
        while (l1 != null){
            if (l1.val >= 10){
                l1.val = l1.val % 10;
                if (l1.next == null){
                    l1.next = new ListNode(0);
                }
                l1.next.val += 1;
            }
            l1 = l1.next;
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}