import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class probs {
    public static void main(String[] args) {
        // System.out.println("SI = " + calSI());
        // System.out.println("The num is: " + oddEven());
        // System.out.println(daysInMonth());
        // System.out.println(vowelCon());

        // String st = revString("Hello");
        // System.out.println(st);

        // int[] a = {5,2,12,14,5};
        // int[] res = nextGreaterElement(a);
        // for(int i: res){
        //     System.out.print(i+" ");
        // }

        String[] ans = generateBinaryNums(5);
        for(String z : ans){
            System.out.print(z+" ");
        }
    }

    public static int calSI(){
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int R = sc.nextInt();
        int T = sc.nextInt();
        int SI = (P * R * T) / 100;
        sc.close();
        return SI;
    }

    public static String oddEven(){
        String s;
        Scanner sca = new Scanner(System.in);
        int z = sca.nextInt();
        if (z % 2 == 0){
            s = "Even";
        } else {
            s = "Odd";
        }
        sca.close();
        return s;
    }

    public static String daysInMonth(){
        String m = "";
        Scanner ss = new Scanner(System.in);
        int N = ss.nextInt();
        switch (N) {
            case 1:
                m = "Jan \n31 days";
                break;
            case 2:
                m = "Feb \n29 days";
                break;
            case 3:
                m = "Mar \n31 days";
                break;
            case 4:
                m = "Apr \n30 days";
                break;
            case 5:
                m = "May \n31 days";
                break;
            case 6:
                m = "Jun \n30 days";
                break;
            case 7:
                m = "Jul \n31 days";
                break;
            case 8:
                m = "Aug \n31 days";
                break;
            case 9:
                m = "Sep \n30 days";
                break;
            case 10:
                m = "Oct \n31 days";
                break;
            case 11:
                m = "Nov \n30 days";
                break;
            case 12:
                m = "Dec \n31 days";
                break;
            default:
                m = "Incorrect Month Value";
                break;
        }
        ss.close();
        return m;
    }

     public static String vowelCon(){
        String m = "";
        Scanner ss = new Scanner(System.in);
        char a = ss.next().charAt(0);
        m = switch (a) {
            case 'a', 'e', 'i', 'o', 'u' -> "Vowel";
            default -> "Consonant";
        };
        ss.close();
        return m;
     }

     public static String revString(String str){
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for(char c: chars){
            stack.push(c);
        }
        for(int i=0; i<str.length(); i++){
            chars[i] = stack.pop();
        }
        return new String(chars);
     }

     public static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && stack.peek()<=arr[i]){
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    public static String[] generateBinaryNums(int n){
        String[] result = new String[n];
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        for(int i = 0; i<n; i++){
            result[i] = q.poll();
            String r1 = result[i] + "0";
            String r2 = result[i] + "1";
            q.offer(r1);
            q.offer(r2);
        }       
        return result;
    }
}
