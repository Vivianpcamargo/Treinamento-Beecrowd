import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int A, B, C, D, DIFERENCA;

        A = Integer.parseInt(in.readLine());
        B = Integer.parseInt(in.readLine());
        C = Integer.parseInt(in.readLine());
        D = Integer.parseInt(in.readLine());
        DIFERENCA = (A*B - C*D);

        System.out.printf("DIFERENCA = %d\n", DIFERENCA);
    }
}
