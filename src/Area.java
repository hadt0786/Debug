import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		double radius = 0, area = 0;
		Scanner cin  = new Scanner(System.in);
		radius = cin.nextDouble();
		area = genrateArea(radius);
		System.out.println(area);
		cin.close();
	}

	private static double genrateArea(double radius) {
		return Math.PI*radius*radius;
	}

}
