import java.util.Scanner;

public class lineComparision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values for the first line");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double length1 = Math.sqrt((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
		System.out.println("The length of the first line is=" +length1);

		System.out.println("Enter the values for the second line");
		double a1 = sc.nextDouble();
		double b1 = sc.nextDouble();
		double a2 = sc.nextDouble();
		double b2 = sc.nextDouble();
		double length2 = Math.sqrt((a2-a1)*(a2-a1))+((b2-b1)*(b2-b1));
		System.out.println("The length of the second line is=" +length2);

		 String s1 = String.valueOf(length1);
		 String s2 = String.valueOf(length2);

		 int comparision = s1.compareTo(s2);
		 if((comparision==0))
		 {
			 System.out.println("The length of line1 and line2 is equal");
		 }
		 else if(comparision<0)
		 {
			 System.out.println("The length of line1 is greater than line2");
		 }
		 else
		 {
			 System.out.println("The length of line1 is less than line2");
		 }

		}

}
