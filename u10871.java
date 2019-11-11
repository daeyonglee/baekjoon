import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
    정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
    둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

    출력
    X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

    입력
    10 5
    1 10 4 9 2 3 8 5 7 6
    출력
    1 4 2 3
 */
/**
 * 만0871
 */
public class u10871 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        String output = "";

        if (n < 1 || n > 10000 || x < 1 || x > 10000) {
            System.exit(1);
        }

        String nums = br.readLine();
        st = new StringTokenizer(nums, " ");
        if (st.countTokens() != n) {
            System.exit(1);
        }
        for (int j=0; j < n; j++) {
            int compareValue = Integer.parseInt(st.nextToken());
            if (compareValue < 1 || compareValue > 10000) {
                System.exit(1);
            }
            if (compareValue < x) {
                output += compareValue + " ";
            }
        }
        bw.write(output.substring(0, output.length() - 1));
        bw.write("\n");
        bw.flush();
        bw.close();
        
    }
}