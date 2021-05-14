package com.app.org;

/*
3 Worker state  --id,name,basic,deptId,hoursWorked,hourlyRate
Behaviour--- 
1. get worker details -- :  override toString.
2.  compute net salary (formula:  = basic+(hoursWorked*hourlyRate) --override computeNetSalary
3. get hrlyRate of the worker  -- add a new method to return hourly rate of a worker.(getter)
*/
public class Worker extends Emplpoyee{
	private int hoursWorked,hourlyRate;

	public Worker(int deptID, String name, double basicSalary, int hoursWorked, int hourlyRate) {
		super(deptID, name, basicSalary);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	
	}


	public int getHourlyRate() {
		return hourlyRate;
	}


	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}


	@Override
	public String toString(){
		return "Designation:\t Worker" + super.toString() + "\nWorking Hrs:s\t" + hoursWorked + "\nHourlyRate:\t" + hourlyRate ; 
		
	}
	
	@Override
	public double computeNetSalary(){
		return (getBasicSalary() + (hoursWorked * hourlyRate));
				}

	public static int idCounter(){
		return Emplpoyee.idCounter();
	}
}
