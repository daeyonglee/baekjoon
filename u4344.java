import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

/*
    대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.

    입력
    첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
    둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

    출력
    각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.

    예제 입력
    5
    5 50 50 70 80 100
    7 100 95 90 80 70 60 50
    3 70 90 80
    3 70 90 81
    9 100 99 98 97 96 95 94 93 91

    예제 출력
    40.000%
    57.143%
    33.333%
    66.667%
    55.556%
*/
/**
 * u4344
 */
public class u4344 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = Integer.parseInt(br.readLine());

        double[] results = new double[c];

        for (int i = 0; i < c; i++) {
            String[] nums = br.readLine().split(" ");
            int resultCount = 0;
            if (Integer.parseInt(nums[0]) < 1 || Integer.parseInt(nums[0]) > 1000) {
                System.exit(0);
            }
            double totalScore = 0;
            for (int j = 1; j < nums.length; j++) {
                if (Integer.parseInt(nums[j]) < 0 || Integer.parseInt(nums[j]) > 100) {
                    System.exit(1);
                }
                totalScore += Integer.parseInt(nums[j]);
            }

            double average = totalScore / Integer.parseInt(nums[0]);

            for (int z = 1; z < nums.length; z++) {
                if (average < Float.parseFloat(nums[z])) {
                    resultCount++;
                }
            }
            double r = ((double)resultCount / Double.parseDouble(nums[0])) * 100;
            results[i] = Math.round(r * 1000) / 1000.0;
        }

        DecimalFormat df = new DecimalFormat("0.000");
        for (int x=0; x < results.length; x++) {
            bw.write(df.format(results[x]) + "%\n");
        }
        bw.flush();
        bw.close();
    }
}