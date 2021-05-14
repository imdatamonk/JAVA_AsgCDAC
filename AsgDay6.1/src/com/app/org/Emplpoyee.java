package com.app.org;

public class Emplpoyee {
	/*
	 * 1 Emp state--- id(int), name, deptId , basic(double)
Accept all of above in constructor arguments.

Behaviour ---1.  get emp details -- by overriding  toString.
2. compute net salary ---return 0
(eg : public double computeNetSalary(){return 0;})
	 */
	private int id,deptID;
	private String name;
	private double basicSalary;
	
	public Emplpoyee(int id, int deptID, String name, double basicSalary) {		
		this.id = id;
		this.deptID = deptID;
		this.name = name;
		this.basicSalary = basicSalary;
		}

	public int getId() {
		return id;
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
		return "\nID No:\t" + id + "\nName:\t " + name + "\nDepartment_ID:\t" + deptID + "\nBasic Salary:\t" + basicSalary;
	}
	
	
	public double computeNetSalary(){
		return 0;
		}
	
	
	
	





	
	
	

}
