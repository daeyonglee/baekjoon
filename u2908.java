import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * u2908
 */
public class u2908 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = reverseString(br.readLine()).split(" ");
        if (arr.length > 2) {
            System.exit(1);
        }
        if (arr[0].length() != 3 || arr[1].length() != 3) {
            System.exit(1);
        }
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        if (a == b) {
            System.exit(1);
        }
        if (a == 0 || b == 0) {
            System.exit(1);
        }

        if (a > b) {
            bw.write(a + "\n");
        } else {
            bw.write(b + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static String reverseString(String str) {
        return new StringBuffer(str).reverse().toString();
    }
}