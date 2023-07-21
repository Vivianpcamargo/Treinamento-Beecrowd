import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String nome;
        double sFixo, totalVenda, total;

        nome = (in.readLine());
        sFixo = Double.parseDouble(in.readLine());
        totalVenda = Double.parseDouble(in.readLine());

        total = sFixo + (totalVenda * 0.15);

        System.out.printf("TOTAL = R$ %2.2f\n", total);
    }
}
