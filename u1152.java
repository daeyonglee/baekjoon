import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
    영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
    
    입력
    첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 띄어쓰기 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열의 앞과 뒤에는 공백이 있을 수도 있다.
    출력
    첫째 줄에 단어의 개수를 출력한다.

    예제 입력
    The Curious Case of Benjamin Button
    예제 출력
    6
*/
/**
 * u1152
 */
public class u1152 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String[] inputs = input.split(" ");
        int count = 0 ;
        for (int i=0; i < inputs.length; i++) {
            if (inputs[i].length() > 1000000) {
                System.exit(1);
            }

            if (inputs[i].length() == 0) {
                continue;
            }
            int ascii = (int)inputs[i].charAt(0);

            if (ascii != 32)  {
                count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
;
    }
}