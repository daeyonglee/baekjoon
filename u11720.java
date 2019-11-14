import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
    N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

    출력
    입력으로 주어진 숫자 N개의 합을 출력한다.

    예제 입력
    11
    10987654321
    예제 출력
    46
*/
/**
 * u11720
 */
public class u11720 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer n = Integer.valueOf(br.readLine());
        String[] nums = br.readLine().split("");
        Integer sum = 0;
        if (n != nums.length) {
            System.exit(0);
        }
        for (int i=0; i < nums.length; i++) {
            sum += Integer.valueOf(nums[i]);
        }

        bw.write(sum+"\n");
        bw.flush();
        bw.close();
    }
}