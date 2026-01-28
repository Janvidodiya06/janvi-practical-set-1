/*
Develop a Java program that prompts the user to enter a distance in meters. Your program
should then convert this distance to feet (1 meter = 3.28084 feet) and display the result
formatted to two decimal places.
*/

import java.util.Scanner;
class MetertoFeetConvert{
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.println("enter distance in meter");
	double meter = sc.nextDouble();
	double feet = (meter*3.28084);
	String result= String.format("%.2f",feet);
	System.out.println("distance in feet :"+result);
	
	
	
sc.close();
}
}