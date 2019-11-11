import java.util.Scanner;

public class u1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        String[] arr = a.split(" ");

        int a1 = Integer.parseInt(arr[0]);
        int a2 = Integer.parseInt(arr[1]);
        
        if (a1 < -10000 && a1 > 10000 && a2 < -10000 && a2 > 10000) {
            System.exit(0);
        }

        if (a1 > a2) {
            System.out.println(">");
        }
        if (a1 < a2) {
            System.out.println("<");
        }
        if (a1 == a2) {
            System.out.println("==");
        }

        sc.close();   
    }
}