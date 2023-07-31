// import java.util.EmptyStackException;

public class stack {
    
    // Linked List method
    // private static ListNode top;
    // private static int length;

    // private static class ListNode{
    //     private int data;
    //     private ListNode next;

    //     public ListNode(int data){
    //         this.data = data;
    //     }
    // }

    // public stack(){
    //     top = null;
    //     length = 0;
    // }

    // public static int length(){
    //     return length;
    // }

    // public static boolean isEmpty(){
    //     return length == 0;
    // }

    // public static void pushEle(int data){
    //     ListNode temp = new ListNode(data);
    //     temp.next = top;
    //     top = temp;
    //     length++;
    // }

    // public static int popEle(){
    //     if(isEmpty()){
    //         throw new EmptyStackException();
    //     }
    //     int result = top.data;
    //     top = top.next;
    //     length--;
    //     return result;
    // }

    // public static int peek(){
    //     if(isEmpty()){
    //         throw new EmptyStackException();
    //     }
    //     return top.data;
    // }

    // Arrays method
    private static int top;
    private static int[] arr;

    public stack(int capacity){
        top = -1;
        arr = new int[capacity];
    }

    public stack(){
        this(10);
    }
    
    public static boolean isEmpty() {return top < 0;}
    public static boolean isFull() {return arr.length == size();}
    public static int size() {return top + 1;} 

    public static void pushEle(int data){
        if(isFull()){
            throw new RuntimeException("The Stack is Full !!");
        }
        top++;
        arr[top] = data;
    }

    public static int popEle(){
        if(isEmpty()){
            throw new RuntimeException("The Stack is Empty !!");
        }
        int result = arr[top];
        top--;
        return result;
    }

    public static int peek(){
         if(isEmpty()){
            throw new RuntimeException("The Stack is Empty !!");
        }
        return arr[top];
    }



    public static void main(String[] args) {

        // using Linked Lists
        // pushEle(12);
        // pushEle(2);
        // pushEle(32);

        // System.out.println(peek());

        // popEle();
        // System.out.println(peek());

        // popEle();
        // System.out.println(peek());

        // System.out.println(popEle());

        new stack();

        pushEle(14);
        pushEle(12);
        pushEle(55);

        System.out.println(peek());

        popEle();
        popEle();

        System.out.println(peek());

    }



































    
}
