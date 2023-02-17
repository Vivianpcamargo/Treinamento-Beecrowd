package VIII.Salario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        int nFunc, nhTRA;
        float vH, s;

        nFunc = Integer.parseInt(in.readLine());
        nhTRA = Integer.parseInt(in.readLine());
        vH = Float.parseFloat(in.readLine());
        
        s = (nhTRA*vH);
        
        System.out.printf("NUMBER = %d\n", nFunc);
        System.out.printf("SALARY = U$ %2.2f\n", s);
        
    }
    
}
