import java.util.Random;
public class EmpWageUC5 {
	
	//Constants
	private static final int EMPWAGEPERHR=20;
	private static final int WORKINGHRSF=8;
	private static final int WORKINGHRSP=4;
	private static final int TOTALWORKINGDAYS=20;
	
	public void emp() {
		
		//Calculation for Monthly Wage
		
	     //double empCheck=Math.floor(Math.random()*10)%3;
		Random rand=new Random();
		int empCheck=rand.nextInt(3);
		System.out.println("Random: no is "+empCheck);
		
		int empDailyWage; //local Variable
		switch (empCheck) {
		case 1:
			System.out.println("This is FUll Time Employee");
			empDailyWage=(EMPWAGEPERHR*WORKINGHRSF*TOTALWORKINGDAYS);
			System.out.println("Monthly wage for Full Time Employee is: "+empDailyWage+" Rs");
			break;
		case 2:
			System.out.println("This is PART Time Employee");
			empDailyWage=(EMPWAGEPERHR*WORKINGHRSP*TOTALWORKINGDAYS);
			System.out.println("Monthly wage for Part Time Employee is: "+empDailyWage+" Rs");
			break;
		default:
			System.out.println("Invalid");
		}

	}

	public static void main(String[] args) {
		//calling method via object
		EmpWageUC5 a=new EmpWageUC5();
		a.emp();

	}

}
