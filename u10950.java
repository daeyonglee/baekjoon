import java.util.Scanner;

/**
    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 테스트 케이스의 개수 T가 주어진다.
    각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

    출력
    각 테스트 케이스마다 A+B를 출력한다.
 */

/**
 * 만0950
 */
public class u10950 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        String[] arrString = new String[length];
        sc.nextLine();

        for (int i=0; i < length; i++) {
            arrString[i] = sc.nextLine();
            String[] temp = arrString[i].split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);

            if (a <= 0 || a >= 10 || b <= 0 || b >= 10) {
                System.exit(0);
            }
        }

        for (int j=0; j < length; j++) {
            String[] temp = arrString[j].split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
            System.out.println(a+b);
        }

        sc.close();
    }
}