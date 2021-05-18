package enums;

/*3. Modify Day10's assignment (Make another separate copy)
3.1 Create an enum CustomerType . Add enum constants as : SILVER , GOLD , PLATUNUM
 */
public enum CustomerType {
	SILVER, GOLD, PLATUNUM;

	@Override 
	public String toString(){ 
		return name().toLowerCase(); 
	}
}
