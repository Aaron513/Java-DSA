import java.util.NoSuchElementException;

public class doublyLinkedList {

    private static ListNode head;
    private static ListNode tail;
    private static int length;

    private static class ListNode {
        private int data;
        private ListNode previous;
        private ListNode next;
        
        public ListNode(int data){
            this.data = data;
        }
    }

    public doublyLinkedList() {
        doublyLinkedList.head = null;
        doublyLinkedList.tail = null;
        doublyLinkedList.length = 0;
    }

    public static boolean isEmpty() {
        return length == 0;
    }

    public static int length(){
        return length;
    }

    public static void displayForward(){
        if(head == null){
            return;
        }

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public static void displayBackward(){
        if(tail == null){
            return;
        }

        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.previous;
        }
        System.out.print("null\n");
    }

    public static void insertBeginning(int val){
        ListNode newNode = new ListNode(val);
        if(isEmpty()){
            tail = newNode;
        }else{
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public static void insertEnd(int val){
        ListNode newNode = new ListNode(val);
        if(isEmpty()){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    public static ListNode deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if(tail == head){
            tail = null;
        }else{
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;        
        length--;
        return temp;
    }

    public static ListNode deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if(tail == head){
            head = null;
        }else{
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;        
        length--;
        return temp;
    }

    public static void main(String[] args) {
        // displayBackward();

        // displayForward();

        insertBeginning(5);
        insertBeginning(7);
        insertBeginning(2);
        insertBeginning(4);
        // displayForward();
        // displayBackward();
        

        // insertEnd(5);
        // insertEnd(7);
        // insertEnd(2);
        // insertEnd(4);
        // displayForward();
        // displayBackward();

        // displayForward();
        // System.out.println(deleteFirst().data);
        // displayForward();
        // displayBackward();

        displayForward();
        System.out.println(deleteLast().data);
        displayForward();
        // displayBackward();
    }
} 