public class singlyLinkList {

    private static ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
        
    }

    public static void display(ListNode head) {
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // public static int countList() {
    //     int counts = 0;
    //     ListNode current = head;
    //     while(current != null){
    //         counts ++;
    //         current = current.next;
    //     }
    //     return counts;
    // }

    // public static void insertFirst(int nodeVal) {
    //     ListNode newNode = new ListNode(nodeVal);
    //     newNode.next = head;
    //     head = newNode;
    // }

    public static void insertEnd(int nodeVal) {
        ListNode newNode = new ListNode(nodeVal);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }

    // public static void insertAny(int nodeVal, int pos) {
    //     ListNode newNode = new ListNode(nodeVal);
    //     if(pos == 1){
    //         newNode.next = head;
    //         head = newNode;
    //     }else{
    //         ListNode previous = head;
    //         int count = 1;
    //         while(count < pos -1){
    //             previous = previous.next;
    //             count++;
    //         }
    //         ListNode current = previous.next;
    //         newNode.next = current;
    //         previous.next = newNode;
    //     }
    // }

    // public static ListNode deleteFirst() {
    //     if(head == null){
    //         return null;
    //     }
    //     ListNode temp = head;
    //     head = head.next;
    //     temp.next = null;
    //     return temp;   
    // }

    // public static ListNode deleteLast() {
    //     if(head == null || head.next == null){
    //         return head;
    //     }
    //     ListNode current = head;
    //     ListNode previous = null;
    //     while(current.next != null){
    //         previous = current;
    //         current = current.next;
    //     }
    //     previous.next = null;
    //     return current;
    // }

    // public static ListNode deleteAny(int pos) {
    //     if(pos == 1){
    //         ListNode temp = head;
    //         head = head.next;
    //         temp.next = null;
    //         return temp;
    //     }else{
    //         ListNode previous = head;
    //         int count = 1;
    //         while(count < pos - 1){
    //             previous = previous.next;
    //             count++;
    //         }
    //         ListNode current = previous.next;
    //         previous.next = current.next;
    //         return current;
    //     }             
    // }

    // public static Boolean elementInList(int nodeVal) {
    //     ListNode current = head;
    //     while(current != null){
    //         if(current.data == nodeVal){
    //             return true;
    //         }
    //         current = current.next;
    //     }
    //     return false;
    // }

    // public static ListNode reverseList(ListNode head) {
    //     if(head == null){
    //         return head;
    //     }
    //     ListNode current = head;
    //     ListNode previous = null;
    //     ListNode next = null;
    //     while(current != null){
    //         next = current.next;
    //         current.next = previous;
    //         previous = current;
    //         current = next;
    //     }
    //     return previous;
    // }

    // public static ListNode middleListNode(ListNode head) {
    //     if(head == null){
    //         return null;
    //     }
    //     ListNode slowptr = head;
    //     ListNode fastptr = head;
    //     while(fastptr != null && fastptr.next != null){
    //         slowptr = slowptr.next;
    //         fastptr = fastptr.next.next;
    //     }
    //     return slowptr;
    // }

    // public static ListNode nthListNodeFromEnd(ListNode head, int n) {
    //     if(head == null){
    //         return null;
    //     }
    //     if(n<=0){
    //         throw new IllegalArgumentException("Invalid Value: n = " + n);
    //     }
    // 
    //     ListNode mainPtr = head;
    //     ListNode refPtr = head;
    //     int count = 0;
    //     while(count < n){
    //         refPtr = refPtr.next;
    //         count++;
    //     }
    //     while(refPtr != null){
    //         refPtr = refPtr.next;
    //         mainPtr = mainPtr.next;
    //     }
    //     return mainPtr;
    // }

    // public static void removeDupliFromSorted(ListNode head) {
    //     if(head == null){
    //         return;
    //     }
    //     ListNode current = head;
    //     while(current != null && current.next != null){
    //         if(current.data == current.next.data){
    //             current.next = current.next.next;
    //         }else{
    //             current = current.next;
    //         }
    //     }        
    // }

    // public static ListNode insertInSortedList(ListNode head, int nodeVal) {
    //     ListNode newNode = new ListNode(nodeVal);
    //     if(head == null){
    //         return newNode;
    //     }
        
    //     ListNode current = head;
    //     ListNode temp = null;
    //     while(current != null && current.data < newNode.data){
    //         temp = current;
    //         current = current.next;
    //     }
    //     newNode.next = current;
    //     temp.next = newNode;
    //     return head;        
    // }

    // public static void deleteKey(int nodeVal){
    //     ListNode current = head;
    //     ListNode temp = null;

    //     if(current!= null && current.data==nodeVal){
    //         head = current.next;
    //         return;
    //     }
    //     while(current != null && current.data != nodeVal){
    //         temp = current;
    //         current = current.next;
    //     }
    //     if(current == null) return;
    //     temp.next = current.next;
    // }

    // public static Boolean isLoop(){
    //     ListNode fastPtr = head;
    //     ListNode slowPtr = head;
    //     while(fastPtr != null && fastPtr.next != null){
    //         fastPtr = fastPtr.next.next;
    //         slowPtr = slowPtr.next;
    //         if(fastPtr == slowPtr){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // public static void createLoopInList(){
    //     ListNode second = new ListNode(6);
    //     ListNode t = new ListNode(3);
    //     ListNode fo = new ListNode(15);
    //     ListNode fi = new ListNode(56);
    //     ListNode si = new ListNode(21);
    //     ListNode se = new ListNode(9);

    //     head = second;
    //     second.next = t;
    //     t.next = fo;
    //     fo.next = fi;
    //     fi.next = si;
    //     si.next = se;
    //     se.next = fo;
    // }



    public static void main(String[] args) {
        // head = new ListNode(1);
        // ListNode second = new ListNode(5);
        
        // head.next = second;

        // display(head);
        
        // int count = countList();
        // System.out.println(count);
        
        // insertFirst(5);
        // display(head);

        // insertEnd(11);
        // insertEnd(13);
        // insertEnd(23);
        // insertEnd(31);
        // insertEnd(39);
        // display(head);

        // insertAny(14, 3);
        // insertAny(19, 2);
        // insertAny(5, 1);
        // insertAny(25, 6);
        // display(head);

        // System.out.println(deleteFirst().data);
        // deleteFirst();
        // display(head);

        // System.out.println(deleteLast().data);
        // deleteLast();
        // display(head);

        // System.out.println(deleteAny(4).data); 
        // deleteAny(3);
        // display(head);

        // boolean z = elementInList(1);
        // System.out.println(z);
        // System.out.println(elementInList(4));

        // ListNode reverseListHead = reverseList(head);
        // display(reverseListHead);

        // ListNode z = middleListNode(head);
        // System.out.println(z.data);

        // ListNode z = nthListNodeFromEnd(head, 2);
        // System.out.println(z.data);

        // removeDupliFromSorted(head);
        // display(head);

        // insertInSortedList(head, 15);
        // display(head);

        // deleteKey(15);
        // display(head);

        // createLoopInList();
        // System.out.println(isLoop());

        
    }










































    
}