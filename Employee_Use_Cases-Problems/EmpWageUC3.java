import java.util.Random;
public class EmpWageUC3 {
	 //int max=1;
	 //int min=0;
	
	//Constants
	private static final int EMPWAGEPERHR=20;
	private static final int WORKINGHRSF=8;
	private static final int WORKINGHRSP=4;
	public void emp() {
		int empDailyWage; //local variable
		
		//Calculation for FullTime & PartTime
	    //double empCheck=Math.floor(Math.random()*10)%2;
		Random rand=new Random();
		int empCheck=rand.nextInt(3);
		System.out.println("Random: no is "+empCheck);
		if(empCheck == 1) {
			System.out.println("This is FUll Time Employee");
			empDailyWage=(EMPWAGEPERHR*WORKINGHRSF);
			System.out.println("Daliy wage of Full Time Employee is: "+empDailyWage+" Rs");
		}
		else if(empCheck == 2) {
			System.out.println("This is PART Time Employee");
			empDailyWage=(EMPWAGEPERHR*WORKINGHRSP);
			System.out.println("Daliy wage of Part Time Employee is: "+empDailyWage+" Rs");
		}
		else {
			System.out.println("Employee is absent");
			empDailyWage=(EMPWAGEPERHR*0);
			System.out.println("Daliy wage of Employee is: "+empDailyWage+" Rs");
		}
		

	}

	public static void main(String[] args) {
		//Calling Method via Object
		EmpWageUC3 a=new EmpWageUC3();
		a.emp();

	}

}
