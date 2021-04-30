import java.util.Scanner;

class LineLength {
	double x1;
	double y1;
	double x2;
	double y2;
	double length;
	LineLength(double x1, double y1, double x2, double y2) {
	    this.x1 = x1;
	    this.y1 = y1;
    	    this.x2 = x2;
	    this.y2 = y2;
	}
	void calculate() {
	    length = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
	}
	void display() {
	    System.out.println("The length of line is=" +length);
	}
}
public class lineComparision {
     public static void main(String[] args) {
	 LineLength l1 = new LineLength(2, 2.2, 4, 7);
	 LineLength l2 = new LineLength(2, 6, 7, 8);
	 l1.calculate();
	 l2.calculate();
	 l1.display();
	 l2.display();
         String s1 = String.valueOf(l1.length);
	 String s2 = String.valueOf(l2.length);
	 if (s1.equals(s2)) {
	     System.out.println("The length of the first line and second lines is equal");
	 }
	 else {
    	        System.out.println("The length of the first line and second line is not equal");
	 }
     }
}

