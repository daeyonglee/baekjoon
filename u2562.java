import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
    9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
    예를 들어, 서로 다른 9개의 자연수
    3, 29, 38, 12, 57, 74, 40, 85, 61
    이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

    입력
    첫 째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
    
    출력
    첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다. 

    예제 입력
    3
    29
    38
    12
    57
    74
    40
    85
    61
    예제 출력
    85
    8

*/

/**
 * 이천562
 */
public class u2562 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 0;
        int index = 1;

        for (int i = 1; i <= 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > 100 || num < 0) {
                System.exit(0);
            }

            if (max < num || i == 0) {
                max = num;
                index = i;
            }
        }

        bw.write(max + "\n");
        bw.write(index + "\n");
        bw.flush();
        bw.close();
    }
}