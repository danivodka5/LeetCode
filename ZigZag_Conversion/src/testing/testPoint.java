package testing;

import java.awt.Point;

public class testPoint {

	public static void main(String[] args) {
		
		Point p1 = new Point(0,1);
		Point p2 = new Point(0,0);
		
		// Metodo equals, dos Puntos son iguales
		System.out.println("p1.equals(p2) = "+p1.equals(p2));
		
		// Metodo getLocation();
		System.out.println("p1.getLocation = "+p1.getLocation());
		
		// 
		System.out.println(p1.getX());
		
		p1.move(1, 0);
		System.out.println(p1.getLocation());
	}
}
