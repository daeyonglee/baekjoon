import java.util.Scanner;

// 시험 점수를 입력받아 
// 90 ~ 100 A
// 80 ~ 89 B
// 70 ~ 79 C
// 60 ~ 69 D
// the rest score F

public class u9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String score = sc.nextLine();

        int s = Integer.parseInt(score);

        if (s < 0 && s > 100) {
            System.exit(0);
        }

        if (s >= 90 && s <= 100) {
            System.out.println("A");
        } else if (s >= 80 && s <= 89) {
            System.out.println("B");
        } else if (s >= 70 && s <= 79) {
            System.out.println("C");
        } else if (s >= 60 && s <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        sc.close();
    }
}