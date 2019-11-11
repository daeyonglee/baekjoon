import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 테스트 케이스의 개수 T가 주어진다.
    각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

    출력
    각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.

    입력
    5
    1 1
    2 3
    3 4
    9 8
    5 2
    출력
    Case #1: 2
    Case #2: 5
    Case #3: 7
    Case #4: 17
    Case #5: 7
*/

/**
 * 만1021
 */
public class u11021 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = Integer.parseInt(br.readLine());
        for (int i=0; i < c; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            if (st.hasMoreTokens()) {
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                if (a <= 0 || a >= 10 || b <= 0 || b >= 10) {
                    continue;
                }
                bw.write("Case #" + (i+1) + ": " + (a + b) + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}