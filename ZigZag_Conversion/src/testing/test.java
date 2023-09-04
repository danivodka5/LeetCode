package testing;

import java.awt.Point;
import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		
		String s = "PAYPALISHIRING";
		
		int altura = 3;
		
		int x = 0;
		int y = 0;
		
		ArrayList< ArrayList<String> > lista = new ArrayList<>(altura);
		
		for(int i=0; i < altura; i++) {
		    lista.add(new ArrayList());
		}
		int c = 1;
		
		// Añadimos la primera letra
		System.out.println("y = "+y + " x = "+x);
		lista.get(0).add( String.valueOf(s.charAt(0)) );

		for (int i=0; i<s.length(); i++) {	
			for (int a = 0; a < altura - 1; a++) {
				System.out.println("y = "+y + " x = "+x+" letra = "+s.charAt(c) + " c = "+c);
				c++;
				
				y++;
				lista.get(y).add( String.valueOf(s.charAt(i)));
			}
			for (int b = altura-1; b > 0; b--) {
				x++;
				y--;
				System.out.println("y = "+y + " x = "+x);
			}
			
		}
		
		System.out.println(lista.get(1));
		
		
		
		/*
		for (int i=0; i<s.length(); i+=4) {
			System.out.println(s.charAt(i));
		}
		System.out.println("---");
		for (int i=1; i<s.length(); i+=2) {
			System.out.println(s.charAt(i));
		}
		System.out.println("----");
		for (int i=2; i<s.length(); i+=4) {
			System.out.println(s.charAt(i));
		}
		
		
		for (int i = altura; i< s.length(); i++) {
			for (int i= )
		}
		*/
	}
}
