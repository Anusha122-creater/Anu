package apjfsa;

public class MethodOverLoading {
	
		
		//method to calculate area of rectangle 
		public void area(int l,int b) {
			int a=l*b;
			System.out.println("Area of Rectangle:"+a);
		}
		//method to calculate area of circle
		public void area(int r) {
			double a=3.14*r*r;
			System.out.println("Area of Circle:"+a);
			}
		//method to calculate area of triangle
		public void area(double b, double h) {
			double a=0.5*b*h;
			System.out.println("Area of Triangle:"+a);
		}
		public static void main(String[] args) {
			MethodOverLoading m=new MethodOverLoading();
			m.area(45,23);
			m.area(8);
			m.area(11,14);

		}

	}

	
