package LXIV.Quadrante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	public class Main {
		public static void main(String[] args) throws IOException {
	        
	        InputStreamReader ir = new InputStreamReader(System.in);
	        BufferedReader in = new BufferedReader(ir);
	        
	       int X, Y;

	        X = Integer.parseInt(in.readLine());
	        Y = Integer.parseInt(in.readLine());
	        
	       if( X == 0 || Y == 0){
	    	   System.exit(0);
	       }else if(X > 0 && Y > 0){
	    	   System.out.printf("primeiro");
	       }else if(X < 0 && Y > 0){
	    	   System.out.printf("segundo");
	       }else if(X < 0 && Y < 0){
	    	   System.out.printf("terceiro");
	       }else if(X > 0 && Y < 0){
	    	   System.out.printf("quarto");
	       }
	    }
	}

