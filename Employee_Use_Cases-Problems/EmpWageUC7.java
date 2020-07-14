import java.util.Random;
public class EmpWageUC7 {
	private static final int maxHrsInMonth=100;
	private static final int workingDays=20;
	private static final int empWagePerHr=20;
	
	public void emp() {
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		int totalSalary=0;
		int empHrs=0;
		while (totalEmpHrs < maxHrsInMonth && totalWorkingDays < workingDays)
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
			totalSalary=totalEmpHrs*empWagePerHr;
			System.out.println("Total salary: "+totalSalary);
		}
	}

	public static void main(String[] args) {
		EmpWageUC7 a=new EmpWageUC7();
		a.emp();

	}

}
