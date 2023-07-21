import java.util.Scanner;

public class tries {
    public static void main(String[] args) {
        // printing
        System.out.println("Hello World");
        
        // declaring variables
        int num = 15;
        System.out.println(num);

        //Primitive
        // data types - Non numeric
        char c = 'a';
        System.out.println(c);
        boolean bool = true;
        System.out.println(bool);

        // data types - Numeric
        int a = 5;      // [32 bits]
        System.out.println(a);
        byte b = 2;     // [-128 : 127]
        System.out.println(b);
        short s = 6;    // [-32768 : 32767]
        System.out.println(s);
        long l = 20L;    // [64 bits][CAP L for it to recognize as long]
        System.out.println(l);

        float f = 2.345232445F;     //[32 bits][CAP F for it to recognize as float]
        System.out.println(f);
        double d = 4.565432343;     //[64 bits]
        System.out.println(d);

        //Non Primitive
        String st = "I like muffins";
        System.out.println(st);
        System.out.println(st.charAt(2));       //charAt gives the character at position (which index we specified)
        System.out.println(st.charAt(1));
        System.out.println(st.charAt(7));

        String st2 = """                        
                1	Liam
                2	Noah
                3	Oliver
                4	James
                5	Elijah      
                """;                                    // triple double inverted commas can store lines of strings
        System.out.println(st2);

        // constants 
        final int z = 2;
        // z = 13;                  will give error since final keywrd is used for z
        System.out.println(z);

        // Reading input
        Scanner sc = new Scanner(System.in);        // uncomment to check the working one at a time.
        // int x = sc.nextInt();
        // System.out.println(x);

        // String str = sc.next();
        // String str = sc.nextLine();
        // System.out.println(str);

        // boolean bool = sc.nextBoolean();
        // System.out.println(bool);

        // For char
        // char ch = sc.next().charAt(0);
        // System.out.println(ch);
        sc.close();

    }
}
