import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
    세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
    예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
    세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.

    출력
    첫째 줄에 새로운 평균을 출력한다. 정답과의 절대/상대 오차는 1/100까지 허용한다.

    예제 입력
    3
    40 80 60
    예제 출력
    75.00

*/

/**
 * u1546
 */
public class u1546 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        String[] tokens = br.readLine().split(" ");
        float max = 0.0f;
        float sum = 0;
        if (count > 1000) {
            System.exit(1);
        }
        if (tokens.length != count) {
            System.exit(1);
        }

        for (int i = 0; i < tokens.length; i++) {
            float tmp = Integer.parseInt(tokens[i]);
            if (i == 0 || max < tmp) {
                max = tmp;
            }
        }

        for (int j = 0; j < tokens.length; j++) {
            float tmp = Integer.parseInt(tokens[j]);
            sum += ((tmp/max) * 100);
        }

        bw.write((sum/tokens.length)+ "\n");
        bw.flush();
        bw.close();

    }
}