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

    public static void display() {
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

    // public static void insertEnd(int nodeVal) {
    //     ListNode newNode = new ListNode(nodeVal);
    //     if(head == null){
    //         head = newNode;
    //         return;
    //     }
    //     ListNode current = head;
    //     while(null != current.next){
    //         current = current.next;
    //     }
    //     current.next = newNode;
    // }

    public static void insertAny(int nodeVal, int pos) {
        ListNode newNode = new ListNode(nodeVal);
        if(pos == 1){
            newNode.next = head;
            head = newNode;
        }else{
            ListNode previous = head;
            int count = 1;
            while(count < pos -1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;
        }
    }

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

    public static void main(String[] args) {
        head = new ListNode(10);
        ListNode second = new ListNode(1);
        
        head.next = second;

        // display();
        
        // int count = countList();
        // System.out.println(count);
        
        // insertFirst(5);
        // display();

        // insertEnd(12);
        // display();

        insertAny(14, 3);
        insertAny(19, 2);
        insertAny(5, 1);
        insertAny(25, 6);
        display();

        // System.out.println(deleteFirst().data);
        // deleteFirst();
        // display();

        // System.out.println(deleteLast().data);
        // deleteLast();
        // display();

        // System.out.println(deleteAny(4).data); 
        // deleteAny(3);
        // display();

    }










































    
}