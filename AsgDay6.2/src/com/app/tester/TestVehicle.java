package com.app.tester;
import java.util.Scanner;
import com.app.vehicles.*;

/*Create a class TestVehicle under the package "tester"
Create an array to store vehicle details
Business Rule : If user enters duplicate registrationNo  : give error message & do not that vehicle details in the array.
After filling up the array , display all vehicle details(Use : toString)*/

public class TestVehicle {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Vehicles you want to add:\n");
		Vehicle[] vhc = new Vehicle[sc.nextInt()];
		//boolean ab = true;
		int i = 0;
		while(i < vhc.length)
		{
			boolean ab = true;
			System.out.println("Enter Vehicle Information :\nRegistration Number: \nVehicle Color \nPrice");
			Vehicle v = new Vehicle(sc.nextInt(),sc.next(),sc.nextDouble());
			
			for (int a = 0;a < i;a++){
				if(vhc[a].equals(v)) {
					System.out.println("Duplicate Vehicle");
					ab = false;
					break;
				}
			}
			
			if(ab){
				vhc[i] = v; 
				i++;
				}
		//	i++;
		}
		for (Vehicle vc : vhc) {
			if(vc != null) {
			System.out.print(vc.toString());
			
		}
		sc.close();
		}
		}
}
