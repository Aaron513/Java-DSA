import java.util.Scanner;
public class probs {
    public static void main(String[] args) {
        // System.out.println("SI = " + calSI());
        System.out.println("The num is: " + oddEven());

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
}
