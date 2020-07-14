import java.util.Random;
public class EmpWageUC3 {
	 //int max=1;
	 //int min=0;
	int empWagePerHr=20;
	int workingHrsF=8;
	int workingHrsP=4;
	int empDailyWage;
	public void emp() {
	     //double empCheck=Math.floor(Math.random()*10)%2;
		Random rand=new Random();
		int empCheck=rand.nextInt(3);
		System.out.println("Random: no is "+empCheck);
		if(empCheck == 1) {
			System.out.println("This is FUll Time Employee");
			empDailyWage=(empWagePerHr*workingHrsF);
			System.out.println("Daliy wage of Full Time Employee is: "+empDailyWage+" Rs");
		}
		else if(empCheck == 2) {
			System.out.println("This is PART Time Employee");
			empDailyWage=(empWagePerHr*workingHrsP);
			System.out.println("Daliy wage of Part Time Employee is: "+empDailyWage+" Rs");
		}
		else {
			System.out.println("Employee is absent");
			empDailyWage=(empWagePerHr*0);
			System.out.println("Daliy wage of Employee is: "+empDailyWage+" Rs");
		}
		

	}

	public static void main(String[] args) {
		EmpWageUC3 a=new EmpWageUC3();
		a.emp();

	}

}
