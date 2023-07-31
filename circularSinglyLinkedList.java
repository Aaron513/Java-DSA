import java.util.NoSuchElementException;

public class circularSinglyLinkedList {
    
    private static ListNode last;
    private static int length;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public circularSinglyLinkedList(){
        last = null;
        length = 0;
    }

    public static int length(){
        return length;
    }

    public static boolean isEmpty(){
        return length == 0;
    }

    public static void createCircularLinkedList(){
        ListNode first = new ListNode(4);
        ListNode se = new ListNode(9);
        ListNode th = new ListNode(15);
        ListNode fo = new ListNode(12);
        ListNode fi = new ListNode(5);
        ListNode si = new ListNode(3);

        first.next = se;
        se.next = th;
        th.next = fo;
        fo.next = fi;
        fi.next = si;
        si.next = first;

        last = si;
        length = 6;
    }

    public static void displayCircularList(){
        if(last == null){
            return;
        }
        
        ListNode first = last.next;
        while(first != last){
            System.out.print(first.data + " --> ");
            first = first.next;
        }
        System.out.println(first.data);
    }

    public static void insertStart(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()){
            last = newNode;
        }else{
            newNode.next = last.next;
        }
        last.next = newNode;
        length++;
    }

    public static void insertEnd(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()){
            last = newNode;
            last.next = last;
        }else{
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public static ListNode removefirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = last.next;
        if(last.next==last){
            last = null;
        }else{
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;
    }

    public static ListNode removelast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = last;
        ListNode first = last.next;
        if(last.next==last){
            last = null;
        }else{
            while (first.next != last) {
            first = first.next;
            }
            first.next = temp.next;
            temp.next = null;
            last = first;
        }
        length--;
        return temp;
    }






    public static void main(String[] args) {
        createCircularLinkedList();

        displayCircularList();

        // insertStart(20);
        // displayCircularList();

        // insertEnd(30);
        // displayCircularList();

        // removefirst();
        // System.out.println(removefirst().data);
        // displayCircularList();
        
        // removelast();
        // System.out.println(removelast().data);
        // displayCircularList();
    }













































}
