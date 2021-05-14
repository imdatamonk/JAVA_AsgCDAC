package com.app.tester;
import java.util.Scanner;
import com.app.vehicles.*;

public class Tester2uSC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Vehicles you want to add:\n");
		Vehicle[] vhc = new Vehicle[sc.nextInt()];
		boolean exit = false;
		int count = 0;
		while(!exit) {
			System.out.println("Enter Your Choices: \n1.Register Vehicle Information \n2. Show Vehicle Details \n3. Exit ");
			switch (sc.nextInt()){
			
			case 1:
				if(count < vhc.length){
					System.out.println("Enter Vehicle Information :\nRegistration Number: \nVehicle Color \nPrice");
					Vehicle v = new Vehicle(sc.nextInt(),sc.next(),sc.nextDouble());
					for (int a = 0;a < count;a++){
						if(vhc[a].equals(v)) {
							System.out.println("Duplicate Vehicle");
						}
						vhc[count] = v;
						count++;
						System.out.println("Vehicle Registered");
					}
				}
				else{
						System.out.println("No Space");
					}
				break;
				
			case 2: 
				for (Vehicle vc : vhc)
				{
					if(vc != null)
					{
						System.out.print(vc);
						}
					}
				break;
				
			case 3:
				exit = true;
				System.out.println("Thnak You");
				break;

			default:
				System.out.println("Enter Collect Values from above");
				break;
			}			
		}
		sc.close();
	}

}
