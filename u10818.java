import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
    N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

    출력
    첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

    예제 입력
    5
    20 10 35 30 7

    예제 출력
    7 35
*/

/**
 * 만0818
 */
public class u10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer n = Integer.parseInt(br.readLine());

        if (n < 1 || n > 1000000) {
            System.exit(1);
        }

        String[] arrStr = br.readLine().split(" ");
        if (n != arrStr.length) {
            System.exit(1);
        }

        int max = 0;
        int min = 0;

        for (int i=0; i < arrStr.length; i++) {
            int val = Integer.parseInt(arrStr[i]);
            if (i == 0) {
                max = val;
                min = val;
                continue;
            }
            if (val < -1000000 || val > 1000000) {
                System.exit(1);
            }
            if (max <= val) {
                max = val;
            } 
            if (min >= val) {
                min = val;
            }
        }

        bw.write(min + " " + max + "\n");
        bw.flush();
        bw.close();
    }
}