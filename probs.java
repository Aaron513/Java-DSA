import java.util.Scanner;
public class probs {
    public static void main(String[] args) {
        // System.out.println("SI = " + calSI());
        // System.out.println("The num is: " + oddEven());
        // System.out.println(daysInMonth());
        // System.out.println(vowelCon());

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
}
