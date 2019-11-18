import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * u2941
 */
public class u2941 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int alphaCount = 0;
        String[] inputs = input.split("");
        int index = 0;

        if (input.length() > 100) {
            System.exit(1);
        }

        while (true) {
            if (index == inputs.length) {
                break;
            }
            if (inputs[index].equals("c") && inputs.length != (index+1)) {
                if (inputs[index + 1].equals("=") || inputs[index + 1].equals("-")) {
                    index += 2;
                } else {
                    index += 1;
                }

                alphaCount++;
            } else if (inputs[index].equals("d") && inputs.length != (index+1)) {
                if (inputs[index + 1].equals("z") && inputs.length != (index+2)) {
                    if (inputs[index + 2].equals("=")) {
                        alphaCount++;
                        index += 3;
                    } else {
                        alphaCount += 2;
                        index += 2;
                    }
                } else if (inputs[index + 1].equals("-")) {
                    alphaCount++;
                    index += 2;
                } else {
                    alphaCount++;
                    index++;
                }
            } else if (inputs[index].equals("l") && inputs.length != (index+1)) {
                if (inputs[index + 1].equals("j")) {
                    index += 2;
                } else {
                    index++;
                }
                alphaCount++;
            } else if (inputs[index].equals("n") && inputs.length != (index+1)) {
                if (inputs[index + 1].equals("j")) {
                    index += 2;
                } else {
                    index++;
                }
                alphaCount++;
            } else if (inputs[index].equals("s") && inputs.length != (index+1)) {
                if (inputs[index + 1].equals("=")) {
                    index += 2;
                } else {
                    index++;
                }
                alphaCount++;
            } else if (inputs[index].equals("z") && inputs.length != (index+1)) {
                if (inputs[index + 1].equals("=")) {
                    index += 2;
                } else {
                    index++;
                }
                alphaCount++;
            } else {
                alphaCount++;
                index++;
            }
        }

        bw.write(alphaCount + "\n");
        bw.flush();
        bw.close();

    }
}