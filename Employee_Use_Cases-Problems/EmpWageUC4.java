import java.util.Random;
public class EmpWageUC4 {
	 
	//Constants
	private static final int EMPWAGEPERHR=20;
	private static final int WORKINGHRSF=8;
	private static final int WORKINGHRSP=4;
	
	public void emp() {
	     //double empCheck=Math.floor(Math.random()*10)%2;
		
		//Calculating Employee Wage using Case-Statements
		Random rand=new Random();
		int empCheck=rand.nextInt(3);
		System.out.println("Random: no is "+empCheck);
		int empDailyWage; //local Variable
		switch (empCheck) {
		case 0:
			System.out.println("Employee is absent");
			empDailyWage=(EMPWAGEPERHR*0);
			System.out.println("Daliy wage of Employee is: "+empDailyWage+" Rs");
			break;
		case 1:
			System.out.println("This is FUll Time Employee");
			empDailyWage=(EMPWAGEPERHR*WORKINGHRSF);
			System.out.println("Daliy wage of Full Time Employee is: "+empDailyWage+" Rs");
			break;
		case 2:
			System.out.println("This is PART Time Employee");
			empDailyWage=(EMPWAGEPERHR*WORKINGHRSP);
			System.out.println("Daliy wage of Part Time Employee is: "+empDailyWage+" Rs");
			break;
		default:
			System.out.println("Invalid");
		}

	}

	public static void main(String[] args) {
		
		//Calling method via Objects
		EmpWageUC4 a=new EmpWageUC4();
		a.emp();

	}

}
