package Easy;

public class MergeTwoSortedLists {


    private ListNode mergeTwoLists(ListNode A, ListNode B) {
            if(A == null)
                return B;
            if(B == null)
                return A;
            ListNode output = null;
            if(A.val < B.val)
            {
                output = A;
                A = A.next;
            }
            else
            {
                output = B;
                B = B.next;
            }
            ListNode curr = output;
            while(A != null && B!= null)
            {
                if(A.val > B.val)
                {
                    curr.next = B;
                    B = B.next;
                }
                else
                {
                    curr.next = A;
                    A = A.next;
                }
                curr = curr.next;
            }
            if(A!= null)
                curr.next = A;
            if(B!= null)
                curr.next = B;
            return output;
        }



    public static class ListNode {
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

        public static void main(String[] args) {
            ListNode listNode1 = new ListNode(7);
            ListNode listNode2 = new ListNode(4);
            MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
            ListNode listNode = mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2);
            System.out.println(listNode.val);

        }
    }