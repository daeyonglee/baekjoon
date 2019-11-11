import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * Test
 */
public class u15552 {

    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int n = Integer.parseInt(bf.readLine());

            if (n > 1000000) {
                System.exit(0);
            }

            for (int i = 0; i < n; i++) {
                String r = bf.readLine();
                StringTokenizer st = new StringTokenizer(r);
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                if (a < 1 || a > 1000 || b < 1 || b > 1000) {
                    System.exit(0);
                }
                bw.write(a + b + "\n");
            }

            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.err.println(e);
        }

    }
}