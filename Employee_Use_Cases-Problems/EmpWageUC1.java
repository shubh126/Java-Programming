import java.util.Random;
public class EmpWageUC1 {
	 //int max=1;
	 //int min=0;
	public void emp() {
		//double empCheck=Math.random()* (max - min + max) + min;
		//System.out.println(empCheck);
		
		//finding Employee is present or not
		Random rand=new Random();
		int empCheck=rand.nextInt(2);
		System.out.println("Random: no is "+empCheck);
		if(empCheck == 1) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is absent");
		}
		

	}

	public static void main(String[] args) {
		//calling object
		EmpWageUC1 a=new EmpWageUC1();
		a.emp();

	}

}
