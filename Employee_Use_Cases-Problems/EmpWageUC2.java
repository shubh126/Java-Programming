
import java.util.Random;
public class EmpWageUC2 {
	 //int max=1;
	 //int min=0;
	
	//constants
	private static final int EMPWAGEPERHR=20;
	private static final int WORKINGHRS=8;
	private static final int EMPDAILYWAGE=20;
	public void emp() {
	      //double empCheck=Math.floor(Math.random()*10)%2;
		Random rand=new Random();
		int empCheck=rand.nextInt(2);
	      
	      int empDailyWage; //local variable
	      
	      //calculating employee wage
		System.out.println("Random: no is "+empCheck);
		if(empCheck == 1) {
			System.out.println("Employee is Present");
			empDailyWage=(EMPWAGEPERHR*WORKINGHRS);
			System.out.println("Daliy wage of Employee is: "+empDailyWage+" Rs");
		}
		else {
			System.out.println("Employee is absent");
			empDailyWage=(EMPWAGEPERHR*0);
			System.out.println("Daliy wage of Employee is: "+empDailyWage+" Rs");
		}
		

	}

	public static void main(String[] args) {
		EmpWageUC2 a=new EmpWageUC2();
		a.emp();

	}

}

