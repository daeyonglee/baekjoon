import java.util.Scanner;

/**
    세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 

    입력
    첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)

    출력
    두 번째로 큰 정수를 출력한다.

    입력
    20 30 10
    출력
    20

    입력
    30 30 10
    출력
    30
 */

/**
 * 만0817
 */
public class u10817 {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] arr = input.split(" ");
        int[] result = new int[3];

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        if (a < 1 || a > 100 || b < 1 || b > 100 || c < 1 || c > 100) {
            System.exit(0);
        }

        if (a >= b) {
            if (a >= c) {
                result[0] = a;
                if (b >= c) {
                    result[1] = b;
                    result[2] = c;
                } else {
                    result[1] = c;
                    result[2] = b;
                }
            } else {
                result[0] = c;
                result[1] = a;
                result[2] = b;
            }
        } else {
            if (b >= c) {
                result[0] = b;
                if (a >= c) {
                    result[1] = a;
                    result[2] = c;
                } else {
                    result[1] = c;
                    result[2] = a;
                }
            } else {
                result[0] = c;
                result[1] = b;
                result[2] = a;
            }
        }


        System.out.println(result[1]);
        sc.close();
    }
}