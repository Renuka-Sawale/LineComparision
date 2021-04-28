import java.util.Scanner;
public class lineComparision {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the values for line");
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double length = Math.sqrt((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
			System.out.println("The length of the line is=" + length);
		}
}

