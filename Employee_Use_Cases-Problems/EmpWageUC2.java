import java.util.Random;
public class EmpWageUC2 {
	 //int max=1;
	 //int min=0;
	int empWagePerHr=20;
	int workingHrs=8;
	int empDailyWage;
	public void emp() {
	      double empCheck=Math.floor(Math.random()*10)%2;
		//Random rand=new Random();
		//int empCheck=rand.nextInt(2);
		System.out.println("Random: no is "+empCheck);
		if(empCheck == 1) {
			System.out.println("Employee is Present");
			empDailyWage=(empWagePerHr*workingHrs);
			System.out.println("Daliy wage of Employee is: "+empDailyWage+" Rs");
		}
		else {
			System.out.println("Employee is absent");
			empDailyWage=(empWagePerHr*0);
			System.out.println("Daliy wage of Employee is: "+empDailyWage+" Rs");
		}
		

	}

	public static void main(String[] args) {
		EmpWageUC2 a=new EmpWageUC2();
		a.emp();

	}

}
