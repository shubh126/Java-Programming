import java.util.Random;

public class EmpWageUC9 {
	
	private String company;
	private int empRatePerHr;
	private int workingDays;
	private int maxHrsInMonth;

	//Calculations
	private int computeWage(String company,int empRatePerHr,int workingDays,int maxHrsInMonth) {
		this.company=company;
		this.empRatePerHr=empRatePerHr;
		this.workingDays=workingDays;
		this.maxHrsInMonth=maxHrsInMonth;
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
			totalEmpHrs+=empHrs;
			//System.out.println("Day: "+totalWorkingDays+" Total Working Hours: "+totalEmpHrs);
			
		}
		return totalSalary=totalEmpHrs*empRatePerHr;
		
	}

	public static void main(String[] args) {
		
		//Single Object for multiple Companies
		EmpWageUC9 company=new EmpWageUC9();
		System.out.println("Monthly Wage For Euronet is: "+company.computeWage("Euronet", 20, 20, 100));
		System.out.println("Monthly Wage For TCS is: "+company.computeWage("Tcs", 20, 25, 100));


	}

}
