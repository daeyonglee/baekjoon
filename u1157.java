import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
    알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

    입력
    첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
    출력
    첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

    예제 입력
    Mississipi
    예제 출력
    ?

    예제 입력
    zZa
    예제 출력
    Z
*/

/**
 * u1157
 */
public class u1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] counts = new int[122 - 97 + 1];
        int maxCount = 0;
        String outputWord = "";
        String[] words = br.readLine().split("");
        if (words.length > 1000000) {
            System.exit(1);
        }

        for (int i = 0; i < words.length; i++) {
            int s = (int) words[i].toLowerCase().charAt(0) - 97;
            counts[s]++;
        }

        for (int j = 0; j < counts.length; j++) {
            if (j == 0) {
                maxCount = counts[j];
                outputWord = Character.toString((char) (j + 97)).toUpperCase();
                continue;
            } 
            if (maxCount < counts[j]) {
                maxCount = counts[j];
                outputWord = Character.toString((char) (j + 97)).toUpperCase();
            } else if (maxCount == counts[j]) {
                maxCount = counts[j];
                outputWord = "?";
            }

        }

        bw.write(outputWord + "\n");
        bw.flush();
        bw.close();
    }
}