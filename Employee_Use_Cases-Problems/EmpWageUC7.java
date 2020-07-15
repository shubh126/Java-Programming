import java.util.Random;
public class EmpWageUC7 {
	
	//Constants
	private static final int MAXHRSINMONTH=100;
	private static final int WORKINGDAYS=20;
	private static final int EMPWAGEPERHR=20;
	
	public void emp() {
		
		//local Variables
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		int totalSalary=0;
		int empHrs=0;
		
		//Calculation
		while (totalEmpHrs < MAXHRSINMONTH && totalWorkingDays < WORKINGDAYS)
		{
			totalWorkingDays++;
			Random rand=new Random();
			int empCheck=rand.nextInt(3);
			System.out.println("Random: no is "+empCheck);
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
			System.out.println("Day: "+totalWorkingDays+" Total Working Hours: "+totalEmpHrs);
			totalSalary=totalEmpHrs*EMPWAGEPERHR;
			System.out.println("Total salary: "+totalSalary);
		}
	}

	public static void main(String[] args) {
		
		//calling method via Object
		EmpWageUC7 a=new EmpWageUC7();
		a.emp();

	}

}
