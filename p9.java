import java.util.Scanner;
public class Rectangle{
	
		double width, hight;
		Rectangle(){
			width = 1;
			hight = 1;
		}

		Rectangle(double w, double h){
			width = w;
			hight = h;
		}

		void getArea(){
			System.out.println("Area of Rectangle : "+ (width * hight));
		}

		void getPerimeter(){
			System.out.println("Perimeter of Rectangle : " + 2 * (width + hight));
		}
		

	public static void main(String[] args){

		System.out.println("Janvi Dodiya ");
		System.out.println("Enrollment No.: 240390107006\n");
		
		Rectangle rec = new Rectangle();
		rec.getArea();
		rec.getPerimeter();
		
		rec = new Rectangle(10.0, 20.0);
		rec.getArea();
		rec.getPerimeter();
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter a & b: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		rec = new Rectangle(a,b);
		rec.getArea();
		rec.getPerimeter();
	}
}
