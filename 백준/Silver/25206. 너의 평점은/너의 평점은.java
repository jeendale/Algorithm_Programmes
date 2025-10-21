import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0.0;   // (학점 × 평점)의 합
        double total = 0.0; // 유효 학점의 합

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();           // 과목명
            double grade = Double.parseDouble(st.nextToken()); // 학점
            String a = st.nextToken();                 // 등급

            if (a.equals("P")) continue; // P 과목은 제외

          double point = 0.0;
          switch (a) {
            case "A+": point = 4.5; break;
            case "A0": point = 4.0; break;
            case "B+": point = 3.5; break;
            case "B0": point = 3.0; break;
            case "C+": point = 2.5; break;
            case "C0": point = 2.0; break;
            case "D+": point = 1.5; break;
            case "D0": point = 1.0; break;
            case "F":  point = 0.0; break;
        }


            sum += grade * point;
            total += grade;
        }

        double gpa = (total == 0.0) ? 0.0 : (sum / total);
        System.out.printf("%.6f%n", gpa);
    }
}
