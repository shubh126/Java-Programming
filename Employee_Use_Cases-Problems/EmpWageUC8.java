import java.util.Random;

public class EmpWageUC8 {
	
	//final global Variables
	private final String company;
	private final int empRatePerHr;
	private final int workingDays;
	private final int maxHrsInMonth;
	
	//Constructor
	private EmpWageUC8(String company,int empRatePerHr,int workingDays,int maxHrsInMonth) {
		this.company=company;
		this.empRatePerHr=empRatePerHr;
		this.workingDays=workingDays;
		this.maxHrsInMonth=maxHrsInMonth;  
	}
	
	//Calculations
	private int computeWage() {
		
		//local Variables
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		int totalSalary=0;
		int empHrs=0;
		while (totalEmpHrs < maxHrsInMonth && totalWorkingDays < workingDays)
		{
			totalWorkingDays++;
			Random rand=new Random();
			int empCheck=rand.nextInt(3);
			//System.out.println("Random: no is "+empCheck);
			switch (empCheck) {
			case 1:
				empHrs=8;
				break;
			case 2:
				empHrs=4;
				break;
			default:
				empHrs=0;
			}
			totalEmpHrs=totalEmpHrs+empHrs;
			//System.out.println("Day: "+totalWorkingDays+" Total Working Hours: "+totalEmpHrs);
			
		}
		return totalSalary=totalEmpHrs*empRatePerHr;
		
	}

	public static void main(String[] args) {
		//Object for Euronet Company
		EmpWageUC8 euronet=new EmpWageUC8("Euronet",20,20,100);
		System.out.println("Total EMployee wage for company:"+euronet.company+" is: "+euronet.computeWage());
		
		//Object for TCS Company
		EmpWageUC8 tcs=new EmpWageUC8("TCS",20,25,100);
		System.out.println("Total EMployee wage for company:"+tcs.company+" is: "+tcs.computeWage());

	}

}
