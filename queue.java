// import java.util.NoSuchElementException;

public class queue {
    
    // Linked List method
    // private static ListNode front;
    // private static ListNode rear;
    // private static int length;

    // private static class ListNode{
    //     private int data;
    //     private ListNode next;

    //     public ListNode(int data){
    //         this.data = data;
    //         this.next = null;
    //     }
    // }

    // public queue(){
    //         front = null;
    //         rear = null;
    //         length = 0;
    //     }

    // public static int length(){
    //     return length;
    // }

    // public static boolean isEmpty(){
    //     return length==0;
    // }

    // public static void display(ListNode head) {
    //     ListNode current = front;
    //     while(current != null){
    //         System.out.print(current.data + " --> ");
    //         current = current.next;
    //     }
    //     System.out.println("null");
    // }

    // public static void enqueue(int data){
    //     ListNode temp = new ListNode(data);
    //     if(isEmpty()){
    //         front = temp;
    //     }else{
    //         rear.next = temp;
    //     }
    //     rear = temp;
    //     length++;
    // }

    // public static int dequeue(){
    //     if(isEmpty()){
    //         throw new NoSuchElementException();
    //     }
    //     int result = front.data;
    //     front = front.next;
    //     if(front == null) rear = null;
    //     length--;
    //     return result;
    // }

    // public int first(){
    //     if(isEmpty()){
    //         throw new NoSuchElementException();
    //     }
    //     return front.data;
    // }

    // public int last(){
    //     if(isEmpty()){
    //         throw new NoSuchElementException();
    //     }
    //     return rear.data;
    // }
    

    // Arrays method
    private static int first;
    private static int rear;
    private static int[] arr;

    public queue(int capacity){
        first = -1;
        rear = -1;
        arr = new int[capacity];
    }

    public queue(){
        this(10);
    }
    
    public static boolean isEmpty() {return first < 0;}
    public static boolean isFull() {return arr.length == size();}
    public static int size() {return first + 1;}

    public static void enqueue(int data){
        if(isFull()){
            throw new RuntimeException("The Stack is Full !!");
        }
        if(isEmpty()){
            first++;
            rear++;
            arr[rear] = data;
        }else{
            rear++;
            arr[rear] = data;
        }
    }

    public static int dequeue(){
        if(isEmpty()){
            throw new RuntimeException("The Stack is Empty !!");
        }
        int result = arr[first];
        first++;
        return result;
    }

    public static int first(){
         if(isEmpty()){
            throw new RuntimeException("The Stack is Empty !!");
        }
        return arr[first];
    }

    public static int last(){
         if(isEmpty()){
            throw new RuntimeException("The Stack is Empty !!");
        }
        return arr[rear];
    }

    public static void main(String[] args) {

        // enqueue(6);
        // enqueue(4);
        // enqueue(22);
        // enqueue(12);
        // display(front);

        // System.out.println(dequeue());
        // System.out.println(dequeue());
        // display(front);

        new queue();

        enqueue(14);
        enqueue(12);
        enqueue(55);

        System.out.println(first());
        System.out.println(last());

        dequeue();
        dequeue();

        System.out.println(first());
        System.out.println(last());
    }
}
