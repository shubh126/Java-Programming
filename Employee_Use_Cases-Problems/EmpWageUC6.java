import java.util.Random;
public class EmpWageUC6 {
	
	//Constants
	private static final int MAXHRSINMONTH=100;
	private static final int WORKINGDAYS=20;
	private static final int EMPWAGEPERHR=20;
	
	public void emp() {
		
		//local variables
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		int totalSalary=0;
		
		//Calculation
		while (totalEmpHrs < MAXHRSINMONTH && totalWorkingDays < WORKINGDAYS)
		{
			totalWorkingDays++;
			Random rand=new Random();
			int empCheck=rand.nextInt(3);
			System.out.println("Random: no is "+empCheck);
			switch (empCheck) {
			case 1:
				int empHrs=8;
				totalEmpHrs=totalEmpHrs+empHrs;
				System.out.println("Day: "+totalWorkingDays+" Total Working Hours: "+totalEmpHrs);
				totalSalary=totalEmpHrs*EMPWAGEPERHR;
				
				break;
			case 2:
				empHrs=4;
				totalEmpHrs=totalEmpHrs+empHrs;
				System.out.println("Day: "+totalWorkingDays+" Total Working Hours: "+totalEmpHrs);
				totalSalary=totalEmpHrs*EMPWAGEPERHR;
				
				break;
			default:
				empHrs=0;
				totalEmpHrs=totalEmpHrs+empHrs;
				System.out.println("Day: "+totalWorkingDays+" Total Working Hours: "+totalEmpHrs);
				totalSalary=totalEmpHrs*EMPWAGEPERHR;
				
			}
			//displaying Salary after each day on hourly basis
			//System.out.println("Total salary: "+totalSalary);
			
		}
		
		//displaying Salary of Month on monthly basis
		System.out.println("Total salary: "+totalSalary);
	}

	public static void main(String[] args) {
		//calling method via Object
		EmpWageUC6 a=new EmpWageUC6();
		a.emp();

	}

}
