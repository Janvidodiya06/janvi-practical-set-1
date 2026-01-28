import java.util.*;
class Cramerrule{
		public static void main(String []args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the value of a:");
			double a= sc.nextDouble();
			System.out.println("enter the value of b:");
			double b= sc.nextDouble();
			System.out.println("enter the value of c:");
			double c= sc.nextDouble();
			System.out.println("enter the value of d:");
			double d= sc.nextDouble();
			System.out.println("enter the value of e:");
			double e= sc.nextDouble();
			System.out.println("enter the value of f:");
			double f= sc.nextDouble();
			double X; 
			double Y;
			double D = ((a*d)-(b*c));
			double Dx = ((e*d)-(b*f));
			double Dy = ((a*f)-(c*e));
			if(D==0)
			{
				System.out.println("D value error");
			}
			else
			{
				 X= Dx/D;
				 Y= Dy/D;
				System.out.println("X=" + X );
				System.out.println("Y=" + Y);
			}
		}
}
