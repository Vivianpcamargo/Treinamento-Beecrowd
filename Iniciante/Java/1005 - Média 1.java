import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double A, B, MEDIA;

        A = Double.parseDouble(in.readLine());
        B = Double.parseDouble(in.readLine());

        A = A * 3.5;
        B = B * 7.5;
        MEDIA = (A+B)/11;

        System.out.printf("MEDIA = %5.5f\n", MEDIA);
    }
}
