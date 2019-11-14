import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * u5622
 */
public class u5622 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int time = 0;

        String[] inputs = input.split("");

        for (int i=0; i < inputs.length; i++) {
            int ascii = (int)inputs[i].toLowerCase().charAt(0) - 96;
            if (ascii > 0 && ascii < 4) {
                time += 3;
            } else if (ascii > 3 && ascii < 7 ) {
                time += 4;
            } else if (ascii > 6 && ascii < 10) {
                time += 5;
            } else if (ascii > 9 && ascii < 13) {
                time += 6;
            } else if (ascii > 12 && ascii < 16) {
                time += 7;
            } else if (ascii > 15 && ascii < 20) {
                time += 8;
            } else if (ascii > 19 && ascii < 23) {
                time += 9;
            } else if (ascii > 22 && ascii < 27) {
                time += 10;
            }
        }

        bw.write(time + "\n");
        bw.flush();
        bw.close();
    }
}