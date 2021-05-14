package com.app.org;

public class Manager extends Emplpoyee {
	/*
	 * 2 Mgr state  ---id,name,basic,deptId , performanceBonus
Behaviour ----1. get mgr details :  override toString. 
2. compute net salary (formula: basic+perfBonus) -- override computeNetSalary
3. get performance bonus. --add a new method to return bonus.(getter)

	 * */
	private double perfomanceBonus;

	public Manager(int id, int deptID, String name, double basicSalary, double perfomanceBonus) {
		super(id, deptID, name, basicSalary);
		this.perfomanceBonus = perfomanceBonus;
			}
	
	public double getPerfomanceBonus() {
		return perfomanceBonus;
	}

	@Override
	public String toString(){
		return "Designation:\t Manager" + super.toString() + "\nPerormance Bonus:\t" + perfomanceBonus ; 
		
	}
	
	@Override
	public double computeNetSalary(){
		return (getBasicSalary() + perfomanceBonus);
		
		}


}
