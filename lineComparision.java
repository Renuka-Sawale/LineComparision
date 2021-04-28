import java.util.Scanner;
public class lineComparision {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the values for line");
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double l1 = Math.sqrt((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
			System.out.println("The length of the first line is=" + l1);

			System.out.println("Enter the values for line");
			double a1 = sc.nextDouble();
			double b1 = sc.nextDouble();
			double a2 = sc.nextDouble();
			double b2 = sc.nextDouble();
			double l2 = Math.sqrt((a2-a1)*(a2-a1))+((b2-b1)*(b2-b1));
			System.out.println("The length of the second line is=" + l2);

			String s1 = String.valueOf(l1);
			String s2 = String.valueOf(l2);

			if (s1.equals(s2)) {
				System.out.println("The length of the first line and second line is equal");
			}
			else {
				System.out.println("The length of the first line and second line is not equal");
			}

	}
}
