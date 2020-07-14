import java.util.Random;
public class EmpWageUC5 {
	 //int max=1;
	 //int min=0;
	int empWagePerHr=20;
	int workingHrsF=8;
	int workingHrsP=4;
	int totalWorkingDays=20;
	int empDailyWage;
	public void emp() {
	     //double empCheck=Math.floor(Math.random()*10)%2;
		Random rand=new Random();
		int empCheck=rand.nextInt(3);
		System.out.println("Random: no is "+empCheck);
		switch (empCheck) {
		case 1:
			System.out.println("This is FUll Time Employee");
			empDailyWage=(empWagePerHr*workingHrsF*totalWorkingDays);
			System.out.println("Monthly wage of Full Time Employee is: "+empDailyWage+" Rs");
			break;
		case 2:
			System.out.println("This is PART Time Employee");
			empDailyWage=(empWagePerHr*workingHrsP*totalWorkingDays);
			System.out.println("Monthly wage of Part Time Employee is: "+empDailyWage+" Rs");
			break;
		default:
			System.out.println("Invalid");
		}

	}

	public static void main(String[] args) {
		EmpWageUC5 a=new EmpWageUC5();
		a.emp();

	}

}
