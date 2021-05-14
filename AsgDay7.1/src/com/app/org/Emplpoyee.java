package com.app.org;

public abstract class Emplpoyee {
	
	private int Id,deptID;
	private String name;
	private double basicSalary;
	private static int UId = 1;
	
	public Emplpoyee(int deptID, String name, double basicSalary) {
		super();
		this.Id = idCounter(); 
		this.deptID = deptID;
		this.name = name;
		this.basicSalary = basicSalary;
		}

	public int getId() {
		return Id;
	}

	public int getDeptID() {
		return deptID;
	}

	public String getName() {
		return name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	@Override
	public String toString() {
		return "\nAutogenrate User_ID No:\t" + Id + "\nName:\t " + name + "\nDepartment_ID:\t" + deptID + "\nBasic Salary:\t" + basicSalary;
	}	

	public static int idCounter(){
		return UId++;
	}
	
	public abstract double computeNetSalary();
	
}
