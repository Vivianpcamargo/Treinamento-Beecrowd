import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double A, B, C, MEDIA;

        A = Double.parseDouble(in.readLine());
        B = Double.parseDouble(in.readLine());
        C = Double.parseDouble(in.readLine());

        A = A * 2;
        B = B * 3;
        C = C* 5;
        MEDIA = (A+B+C)/10;

        System.out.printf("MEDIA = %1.1f\n", MEDIA);
    }
}
