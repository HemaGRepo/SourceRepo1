import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Code to find the area and perimeter of a circle
public class CircleArea {

	public static void main(String args[]) throws IOException{
		
		//input is radius
		float radius;
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		//Read the radius as input
		System.out.println("Enter the radius");
		String temp=br.readLine();
		radius=Float.parseFloat(temp);
		
		//Area of a circle- Pi*radius*radius
		double area=Math.PI*radius*radius;
		
		//Perimeter of a circle - 2*Pi*radius
		double perimeter=2*Math.PI*radius;
		
		System.out.println("Area ="+area);
		System.out.println("Perimeter ="+perimeter);
	}
}
