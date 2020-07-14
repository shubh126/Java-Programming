import java.util.Random;
public class EmpWageUC6 {
	int maxHrsInMonth=100;
	
	int workingDays=20;
	int empWagePerHr=20;
	int totalEmpHrs=0;
	int totalWorkingDays=0;
	int totalSalary=0;
	public void emp() {
		while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays <= workingDays)
		{
			totalWorkingDays++;
			Random rand=new Random();
			int empCheck=rand.nextInt(3);
			System.out.println("Random: no is "+empCheck);
			switch (empCheck) {
			case 1:
				int empHrs=8;
				totalEmpHrs=totalEmpHrs+empHrs;
				System.out.println("Total Working Hours: "+totalEmpHrs);
				totalSalary=totalEmpHrs*empWagePerHr;
				System.out.println("Total salary: "+totalSalary);
				break;
			case 2:
				empHrs=4;
				totalEmpHrs=totalEmpHrs+empHrs;
				System.out.println("Total Working Hours: "+totalEmpHrs);
				totalSalary=totalEmpHrs*empWagePerHr;
				System.out.println("Total salary: "+totalSalary);
				break;
			default:
				empHrs=0;
				totalEmpHrs=totalEmpHrs+empHrs;
				System.out.println("Total Working Hours: "+totalEmpHrs);
				totalSalary=totalEmpHrs*empWagePerHr;
				System.out.println("Total salary: "+totalSalary);
			}
			
		}
	}

	public static void main(String[] args) {
		EmpWageUC6 a=new EmpWageUC6();
		a.emp();

	}

}
